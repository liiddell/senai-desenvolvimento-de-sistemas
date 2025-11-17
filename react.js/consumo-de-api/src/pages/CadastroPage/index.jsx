import { useForm } from 'react-hook-form';
import { yupResolver } from '@hookform/resolvers/yup';
import * as yup from 'yup';

import api from '../../services/api';
import { toast } from 'react-toastify';

import './styles.css';

const esquemaDeCadastro = yup.object({
    nome: yup.string().required("O nome é obrigatório"),
    email: yup.string().email("Digite um e-mail válido").required("O e-mail é obrigatório"),
    senha: yup.string().min(6, "A senha deve ter pelo menos 6 caracteres").required("A senha é obrigatória"),
    confirmarSenha: yup
        .string()
        .oneOf([yup.ref('senha'), null], "As senhas devem corresponder")
        .required("A confirmação de senha é obrigatória"),
});

export default function CadastroPage() {
    const {
        register: cadastrar,
        handleSubmit: enviarCadastro,
        formState: { errors: errosDeCadastro, isSubmitting: enviandoCadastro },
        setError: definirErroDeCadastro,
        reset: resetarFormularioDeCadastro
    } = useForm({
        resolver: yupResolver(esquemaDeCadastro),
        defaultValues: {
            nome: '',
            email: '',
            senha: '',
            confirmarSenha: '',
        },
    });

    async function enviarDados(dadosDeCadastro) {
        const dadosApi = {
            nome: dadosDeCadastro.nome,
            email: dadosDeCadastro.email,
            senha: dadosDeCadastro.senha,
        };

        try {
            const resposta = await api.post('/usuarios', dadosApi);

            toast.success(resposta.data.mensagem || 'Cadastro realizado com sucesso!');
            resetarFormularioDeCadastro();

        } catch (erro) {
            const codigoStatus = erro.response?.status;
            const mensagemErro = erro.response?.data?.mensagem || 'Ocorreu um erro no cadastro. Tente novamente.';

            if (codigoStatus === 409) {
                definirErroDeCadastro('email', {
                    type: 'server',
                    message: mensagemErro,
                });
            }

            toast.error(mensagemErro);
            console.error('Erro ao cadastrar:', erro);
        }
    }

    return (
        <div className="cadastro-container">
            <h2>Cadastro</h2>

            <form noValidate onSubmit={enviarCadastro(enviarDados)}>

                {/* Nome */}
                <div className="form-group">
                    <label htmlFor="nome">Nome:</label>
                    <input
                        type="text"
                        id="nome"
                        placeholder="Ex: João Silva"
                        {...cadastrar('nome')}
                    />
                    {errosDeCadastro.nome && (
                        <span className="error-message">{errosDeCadastro.nome.message}</span>
                    )}
                </div>

                {/* Email */}
                <div className="form-group">
                    <label htmlFor="email">E-mail:</label>
                    <input
                        type="email"
                        id="email"
                        placeholder="Ex: joao@email.com"
                        {...cadastrar('email')}
                    />
                    {errosDeCadastro.email && (
                        <span className="error-message">{errosDeCadastro.email.message}</span>
                    )}
                </div>

                {/* Senha */}
                <div className="form-group">
                    <label htmlFor="senha">Senha:</label>
                    <input
                        type="password"
                        id="senha"
                        placeholder="Digite sua senha"
                        {...cadastrar('senha')}
                    />
                    {errosDeCadastro.senha && (
                        <span className="error-message">{errosDeCadastro.senha.message}</span>
                    )}
                </div>

                {/* Confirmar senha */}
                <div className="form-group">
                    <label htmlFor="confirmarSenha">Confirmar Senha:</label>
                    <input
                        type="password"
                        id="confirmarSenha"
                        placeholder="Repita sua senha"
                        {...cadastrar('confirmarSenha')}
                    />
                    {errosDeCadastro.confirmarSenha && (
                        <span className="error-message">{errosDeCadastro.confirmarSenha.message}</span>
                    )}
                </div>

                {/* Botão */}
                <button type="submit" disabled={enviandoCadastro} className="btn-cadastrar">
                    {enviandoCadastro ? "Enviando..." : "Cadastrar"}
                </button>

            </form>
        </div>
    );
}
