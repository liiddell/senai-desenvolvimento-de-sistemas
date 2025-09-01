package heranca2;

public class Main {
    public static void main(String[] args) {

        Endereco enderecoEngenheiro = new Endereco("Rua A", "123", "12345-678", "Cidade X");
        Engenheiro engenheiro = new Engenheiro("João Silva", "email@gmail.com", 5000.0, enderecoEngenheiro, "CREA12345");
        engenheiro.exibirDados();

        System.out.println();
        Endereco enderecoMedico = new Endereco("Rua B", "456", "98765-432", "Cidade Y");
        Medico medico = new Medico("Maria Souza", "mariasouza@gmail.com", 7000.0, enderecoMedico, "CRM67890");
        medico.exibirDados();

    }
}
