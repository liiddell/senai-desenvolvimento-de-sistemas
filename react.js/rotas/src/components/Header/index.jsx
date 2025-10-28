import { Link } from 'react-router-dom';
import '.style.css';


export default function Header() {
    return (
        <header className='header-container'>
            <div>Gestão de funcionários</div>
            <nav>
                <Link to= "/">Home</Link>
                <Link to= "/cadastrar">Cadastro</Link>
                <Link to= "/listar">Lista</Link>
            </nav>
        </header>
    );
}