import { useForm } from 'react-hook-form';
import { yupResolver } from '@hookform/resolvers/yup';
import * as yup from 'yup';

import api from '../../services/api';
import { toast } from 'react-toastify';

import './styles.css';

const esquemaDeCadastro = yup.object({
    nome: yup.string().required("O nome é obrigatório"),
    email: yup.string().email("Digite um e-mail válido").required("O e-mail é obrigatório"),
    senha: yup.string().min(8, "A senha deve ter pelo menos 6 caracteres").required("A senha é obrigatória"),
    confirmarSenha: yup.string().oneOf([yup.ref('senha'), null], "As senhas devem corresponder").required("A confirmação de senha é obrigatória"),
})

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


}