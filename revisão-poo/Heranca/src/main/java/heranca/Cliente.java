package heranca;

public class Cliente extends Pessoa {

    private String dataCompra;
    private String formaPagamento;

    public Cliente(String nome, int idade, String dataCompra, String formaPagamento) {
        super(nome, idade);
        this.dataCompra = dataCompra;
        this.formaPagamento = formaPagamento;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("========== Cliente ==========\n");
        super.exibirInformacoes();
        System.out.printf("Data da compra: " +this.dataCompra+"\n");
        System.out.printf("Forma de pagamento: " +this.formaPagamento+"\n");
    }
}
