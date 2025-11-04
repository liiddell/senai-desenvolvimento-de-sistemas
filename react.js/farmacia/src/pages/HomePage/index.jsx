import './style.css'
import Doctor from '../../assets/Doctor-PNG-Images.png'


export default function HomePage() {
  return (
    <div className="home-container">
      {/* Banner principal */}
      <section className="hero-section">
        <div className="hero-content">
          <h1>Melhore sua saúde com os melhores medicamentos</h1>
          <p>
            Produtos selecionados com qualidade e confiança para o seu bem-estar.
          </p>
          <button className="btn-primary">Ver Produtos</button>
        </div>
        <div className="hero-image">
          <img
          src={Doctor}
          />
        </div>
      </section>

      <section className="section">
        <h2>Produtos em Destaque</h2>
        <div className="product-grid">
          {[
            { name: "Máscara Cirúrgica", price: "R$ 25,00" },
            { name: "Álcool em Gel 500ml", price: "R$ 15,90" },
            { name: "Termômetro Digital", price: "R$ 49,90" },
            { name: "Suplemento Vitamínico", price: "R$ 39,00" },
          ].map((item, index) => (
            <div key={index} className="product-card">
              <img
                src=""
                alt={item.name}
              />
              <h3>{item.name}</h3>
              <p className="price">{item.price}</p>
              <button className="btn-secondary">Adicionar ao carrinho</button>
            </div>
          ))}
        </div>
      </section>

      <section className="section offers">
        <h2>Ofertas Especiais</h2>
        <div className="offer-banner">
          <div>
            <h3>Frete Grátis acima de R$ 99</h3>
            <p>Aproveite nossas ofertas e economize nas suas compras!</p>
            <button className="btn-primary">Comprar Agora</button>
          </div>
        </div>
      </section>

 
      <section className="section testimonials">
        <h2>O que nossos clientes dizem</h2>
        <div className="testimonial-grid">
          <div className="testimonial-card">
            <p>
              “Excelente atendimento e entrega super rápida. Recomendo muito!”
            </p>
            <strong>- Maria Souza</strong>
          </div>
          <div className="testimonial-card">
            <p>
              “Produtos de qualidade e preços justos. Voltarei a comprar.”
            </p>
            <strong>- João Pereira</strong>
          </div>
        </div>
      </section>
    </div>
  );
}