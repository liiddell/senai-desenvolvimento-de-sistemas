package Atividade02;

public class Livro {
    private String titulo;
    private String autor;
    private int ISBN;
    private int numeroDePaginas;
    private double valor;

    public Livro(String titulo, String autor, int ISBN, int numeroDePaginas, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroDePaginas = numeroDePaginas;
        this.valor = valor;
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

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void exibirDados() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Número de Páginas: " + this.numeroDePaginas);
        System.out.println("Valor: R$" + this.valor);
    }
}
