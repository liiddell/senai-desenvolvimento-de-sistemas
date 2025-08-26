package heranca;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Jorge", 25, "26/08/2025", "Crédito");
        Funcionario f1 = new Funcionario("Maria", 28,"21548", "Vendedora", 2500.0);

        c1.exibirInformacoes();
        f1.exibirInformacoes();


    }
}
