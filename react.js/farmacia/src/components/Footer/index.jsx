// src\components\Footer\index.jsx

import './style.css'

export default function Footer() {
    return (
        <footer className='footer-container'>
            <div>
                <strong>Saúde+</strong>
                <br />
                CNPJ - 00.000.000/0000
            </div>
            <div>
                Rua A, 123 - Centro - Salvador - Bahia
            </div>
            <div>
                &copy; {new Date().getFullYear()} - Todos os direitos reservados
            </div>
        </footer>
    )
}


