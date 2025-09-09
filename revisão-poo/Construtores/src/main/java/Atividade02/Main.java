package Atividade02;

public class Main {
    public static void main(String[] args) {

        Endereco e1 = new Endereco("Rua A", 123, "São Paulo");
        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 123456789, 300, 29.90);
        Livro l2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 987654321, 500, 59.90);

        Veiculo v1 = new Veiculo("ABC-1234", "Preto", 5, 50, 180, 12.5);
        Veiculo v2 = new Veiculo("XYZ-5678", "Branco", 7, 60, 200, 10.0);

        Cliente c1 = new Cliente("João Silva", 30, "123.456.789-00", "(11) 91234-5678", e1);
        Cliente c2 = new Cliente("Maria Oliveira", 25, "987.654.321-00", "(21) 99876-5432", e1);

        System.out.println("Dados do Livro:");
        l1.exibirDados();
        System.out.println("---------------------------------");

        System.out.println("Dados do Veículo:");
        v1.exibirDados();
        System.out.println("---------------------------------");

        System.out.println("Dados do Cliente:");
        c1.exibirDados();

    }
}
