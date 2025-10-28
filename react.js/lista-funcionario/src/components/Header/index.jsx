// src\components\Header

import './style.css'

function Header(){
    return (
        <header className='header-container'>
            <div className='logo'>Funcionários</div>
            <nav className='paginas'>
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Sobre nós</a></li>
                    <li><a href="#">Contato</a></li>
                </ul>
            </nav>
        </header>
    )
}

export default Header
