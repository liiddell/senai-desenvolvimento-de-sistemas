package heranca03;

public abstract class Produto {
    protected String marca;
    protected String cor;
    protected String tamanho;
    protected double preco;

    public Produto(String marca, String cor, String tamanho, double preco) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDados(){
        System.out.println("Marca: "+ this.marca);
        System.out.println("Cor: " +this.cor);
        System.out.println("Tamanho: " +this.tamanho);
        System.out.println("Preço: " +this.preco);
    }
}
