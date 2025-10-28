// src\components\Footer\index.jsx

import './style.css'

export default function Footer(){
    return (
        <footer className='footer-container'>
            <p>&copy; {new Date().getFullYear()} - Todos os direitos reservados</p>
        </footer>
    )
}


