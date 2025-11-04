import './style.css'

export default function FaleConosco() {
    function handleSubmit(e) {
        e.preventDefault();
        alert("Solicitação recebida! Em breve nossa equipe entrará em contato para confirmar os detalhes.");
    }

    return (
        <section className='contato'>
            <h1>Fale conosco</h1>
            <p>Envie sua solicitação: renovação de receita, compra de produto, dúvidas sobre medicamentos ou pedido de entrega.</p>

            <form className='form' onSubmit={handleSubmit}>
                <div className='grid-cols-3'>
                    <label className='field'>
                        <span>Nome</span>
                        <input type="text" required placeholder='Seu nome completo' />
                    </label>

                    <label className='field'>
                        <span>E-mail</span>
                        <input type='email' required placeholder='voce@mail.com' />
                    </label>

                    <label className='field'>
                        <span>Telefone</span>
                        <input type='tel' placeholder='(00) 00000-0000' />
                    </label>
                </div>

                <label className='field'>
                    <span>Tipo de solicitação</span>
                    <select required>
                        <option value="">Selecione</option>
                        <option value="receita">Renovação/Envio de receita</option>
                        <option value="compra">Compra de produto</option>
                        <option value="duvida">Dúvida sobre uso</option>
                        <option value="entrega">Entrega/Retirada</option>
                        <option value="outro">Outro</option>
                    </select>
                </label>

                <div className='grid-cols-3'>
                    <label className='field'>
                        <span>Nome do medicamento</span>
                        <input type="text" placeholder='Ex.: Paracetamol' />
                    </label>

                    <label className='field'>
                        <span>Dosagem</span>
                        <input type='text' placeholder='Ex.: 500 mg' />
                    </label>

                    <label className='field'>
                        <span>Quantidade</span>
                        <input type='number' min="1" placeholder='Ex.: 2' />
                    </label>
                </div>

                <label className='field'>
                    <span>Anexar receita (opcional)</span>
                    <input type="file" accept=".pdf,image/*" />
                </label>

                <label className='field'>
                    <span>Preferência de entrega</span>
                    <div style={{ display: 'flex', gap: '12px', alignItems: 'center' }}>
                        <label style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
                            <input type="radio" name="entrega" value="retirada" defaultChecked /> Retirar na loja
                        </label>
                        <label style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
                            <input type="radio" name="entrega" value="entrega" /> Entrega em domicílio
                        </label>
                    </div>
                </label>

                <label className='field'>
                    <span>Endereço para entrega (se aplicável)</span>
                    <input type="text" placeholder='Rua, número, bairro, cidade - apenas se escolher entrega' />
                </label>

                 <label className='field'>
                    <span>Observações / Detalhes</span>
                    <textarea rows="6" placeholder='Informações adicionais: alergias, horários preferenciais, etc.'></textarea>
                </label>

                <button className='btn primary' type='submit'>Enviar solicitação</button>
            </form>
        </section>
    );
}
