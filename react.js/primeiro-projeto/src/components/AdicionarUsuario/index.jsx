// src\components\AdicionarUsuario\index.jsx


import '.style.css'
import { use, useState } from 'react'

function AdicionarUsuario() {
    const [nome, setNome] = useState('');
    const [email, setEmail] = useState('');

    const [usuarios, setUsuarios] = useState([])

    const handleSubmit = (event) => {
        event.preventDefault();
        if (nome && email) {
            setUsuarios([...usuarios, { nome, email }]);
            setNome('');
            setEmail('');
        }

    }

    return (
        <div>
            <h2>Adicionar Usuário</h2>
            <form onSubmit={handleAdicionarUsuario}>
                <input
                    type="text"
                    placeholder="Nome"
                    value={nome}
                    onChange={(e) => setNome(e.target.value)}
                />

                <input
                    type="email"
                    placeholder="Email"
                    value={email}
                    onChange={(e) => setEmail(e.target.value)}
                />

                <button type="submit">Adicionar</button>
            </form>

            <h3>Usuários adicionados</h3>
            <ul>
                {usuarios.map((usuario, index) => (
                    <li key={index}>{usuario.nome} - {usuario.email}</li>
                ))}
            </ul>
        </div>

    )


}

export default AdicionarUsuario