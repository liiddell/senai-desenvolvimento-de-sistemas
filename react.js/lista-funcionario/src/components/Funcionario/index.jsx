// src/components/Funcionario/index.jsx

import './style.css'
import { useState } from 'react'

function Funcionario() {
    const [nome, setNome] = useState('');
    const [telefone, setTelefone] = useState('');
    const [funcionarios, setFuncionarios] = useState([]);

    const handleSubmit = (event) => {
        event.preventDefault();
        if (nome && telefone) {
            setFuncionarios([...funcionarios, { nome, telefone }]);
            setNome('');
            setTelefone('');
        }
    };

    return (
        <div className='adicionar-funcionario-container'>
            <h2>Adicionar Funcionário</h2>

            <form onSubmit={handleSubmit}>
                <input
                    type="text"
                    placeholder="Nome"
                    value={nome}
                    onChange={(e) => setNome(e.target.value)}
                />

                <input
                    type="number"
                    placeholder="Telefone"
                    value={telefone}
                    onChange={(e) => setTelefone(e.target.value)}
                />

                <button type="submit">Adicionar</button>
            </form>

            <h3>Funcionários adicionados</h3>
            <ul>
                {funcionarios.map((funcionario, index) => (
                    <li key={index}>{funcionario.nome} - {funcionario.telefone}</li>
                ))}
            </ul>
        </div>
    );
}

export default Funcionario;
