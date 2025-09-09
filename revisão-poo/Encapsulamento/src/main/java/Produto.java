public class Produto {
    private String nomeProduto;
    private double preco;

    public Produto(String nomeProduto, double preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDados() {
        System.out.println("Nome do Produto: " + getNomeProduto());
        System.out.println("Preço: R$ " + getPreco());
    }
}
