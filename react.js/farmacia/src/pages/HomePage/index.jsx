import './style.css'
import Doctor from '../../assets/Doctor-PNG-Images.png'

export default function HomePage() {
  const produtos = [
    { name: "Máscara Cirúrgica", price: "R$ 25,00", img: "src/assets/mascara-cirurgica.png" },
    { name: "Álcool em Gel 500ml", price: "R$ 15,90", img: "src/assets/alcool-gel.png" },
    { name: "Termômetro Digital", price: "R$ 49,90", img: "src/assets/termometro.webp" },
    { name: "Suplemento", price: "R$ 39,00", img: "src/assets/suplemento.webp" },
    { name: "Suplemento", price: "R$ 39,00", img: "src/assets/suplemento-2.webp" },
  ]

  const depoimentos = [
    { text: "Excelente atendimento e entrega super rápida. Recomendo muito!", author: "Maria Souza" },
    { text: "Produtos de qualidade e preços justos. Voltarei a comprar.", author: "João Pereira" },
    { text: "Site fácil de usar e entrega antes do prazo. Adorei!", author: "Carla Lima" },
  ]

  return (
    <div className="home-container">
      <section className="hero-section">
        <div className="hero-content">
          <h1>Melhore sua saúde com os melhores medicamentos</h1>
          <p>Produtos selecionados com qualidade, confiança e entrega rápida para o seu bem-estar.</p>
          <button className="btn-primary">Ver Produtos</button>
        </div>
        <div className="hero-image">
          <img src={Doctor} alt="Profissional de saúde" />
        </div>
      </section>

      <section className="section">
        <h2>Produtos em Destaque</h2>
        <div className="product-grid">
          {produtos.map((item, index) => (
            <div key={index} className="product-card">
              <img src={item.img} alt={item.name} />
              <h3>{item.name}</h3>
              <p className="price">{item.price}</p>
              <button className="btn-secondary">Adicionar ao carrinho</button>
            </div>
          ))}
        </div>
      </section>

      <section className="section offers">
        <div className="offer-banner">
          <h2>Ofertas Especiais</h2>
          <h3>Frete grátis acima de R$ 99</h3>
          <p>Aproveite nossas promoções e cuide da sua saúde com economia.</p>
          <button className="btn-primary">Comprar Agora</button>
        </div>
      </section>

      <section className="section testimonials">
        <h2>O que nossos clientes dizem</h2>
        <div className="testimonial-grid">
          {depoimentos.map((d, i) => (
            <div key={i} className="testimonial-card">
              <p>“{d.text}”</p>
              <strong>- {d.author}</strong>
            </div>
          ))}
        </div>
      </section>
    </div>
  )
}
