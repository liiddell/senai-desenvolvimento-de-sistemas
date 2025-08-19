package Atividade02;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 123456789, 300, 29.90);
        Livro l2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 987654321, 500, 59.90);

        Veiculo v1 = new Veiculo("ABC-1234", "Preto", 5, 50, 180, 12.5);
        Veiculo v2 = new Veiculo("XYZ-5678", "Branco", 7, 60, 200, 10.0);

        System.out.println("Dados do Livro 1:");
        l1.exibirDados();
        System.out.println("---------------------------------");
        System.out.println("Dados do Livro 2:");
        l2.exibirDados();
        System.out.println("---------------------------------");
        System.out.println("Dados do Veículo 1:");
        v1.exibirDados();
        System.out.println("---------------------------------");
        System.out.println("Dados do Veículo 2:");
        v2.exibirDados();

    }
}
