import { Link, NavLink } from 'react-router-dom';
import Logo from '../../assets/logo.png'
import './style.css';


export default function Header() {
    return (
        <header className='header-container'>
            <div className='logo'>
                <Link to='/'>
                    <img src={Logo} alt="Logo da contabilidade" />
                </Link>
                </div>
            <nav>
                <NavLink to= "/servicos">Serviços</NavLink>
                <NavLink to= "/sobre-nos">Sobre nós</NavLink>
                <NavLink to="/contato">Contatos</NavLink>
            </nav>
        </header>
    );
}