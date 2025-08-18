package atividade01;

public class Livro {
    private String titulo, autor;
    private int numPaginas;
    private double preco;

    public Livro(String titulo, String autor, int numPaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDados(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Número de Páginas: " + getNumPaginas());
        System.out.println("Preço: R$ " + getPreco());
    }
}
