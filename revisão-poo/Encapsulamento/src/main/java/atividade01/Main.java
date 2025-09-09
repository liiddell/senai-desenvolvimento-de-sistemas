package atividade01;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 200, 39.90);
        l1.exibirDados();
        System.out.println("-------------------");
        Livro l2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 500, 89.90);
        l2.exibirDados();
        System.out.println("-------------------");
    }
}

