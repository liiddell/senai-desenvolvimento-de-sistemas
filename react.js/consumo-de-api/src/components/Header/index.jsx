import { Link } from 'react-router-dom';
import './styles.css';


function Header(){
    return (
        <header className='header-container'>
            <div className='logo'>Sistema de Usuários</div>
            <nav>
                <Link to="/">Home</Link>
                <Link to="/cadastro">Cadastrar Usuário</Link>
                <Link to="/usuarios">Listar Usuários</Link>
            </nav>
        </header>
    )
}

export default Header