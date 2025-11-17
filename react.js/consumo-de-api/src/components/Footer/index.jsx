import './styles.css';

function Footer(){
    return(
        <footer className='footer-container'>
        <p>&copy; {new Date().getFullYear()} SENAI Dendezeiros</p>
        <p>CNPJ: 12.345.678/0001-90</p>
        <p>Todos os direitos reservados</p>
       </footer>
    )
}

export default Footer