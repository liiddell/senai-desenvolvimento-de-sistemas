import './styles.css';
import { useEffect, useState } from 'react';
import api from '../../services/api';
import { toast } from 'react-toastify';


export default function ListaPage() {
    const [usuarios, setUsuarios] = useState([]);
    const [carregando, setCarregando] = useState(true);

    useEffect(() => {
    async function buscarUsuarios() {
      try {
        const resposta = await api.get('/usuarios');
        setUsuarios(resposta.data);
      } catch (error) {
        console.error('Erro ao buscar usuários:', error);
        const mensagemError = error.response?.data?.mensagem || 'Erro ao buscar usuários.';
        toast.error(mensagemError);
      } finally {
        setCarregando(false);
      }
    }
    buscarUsuarios();
    }, []);

    if (carregando) {
        return <div>Carregando...</div>
    }

    return (
        <div className="lista-container">
            <h2>Lista de Usuários</h2>
            {usuarios.length === 0 ? ( 
                <p>Nenhum usuário cadastrado.</p>
            ) : (
                <ul>
                    {usuarios.map((usuario) => (
                        <li key={usuario.id}>{usuario.nome}</li>
                    ))}
                </ul>
            )}
        </div>
    );
}

                

