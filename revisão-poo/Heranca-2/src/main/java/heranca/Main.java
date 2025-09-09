package heranca;

public class Main {
    public static void main(String[] args) {
        Fisica pessoaFisica = new Fisica("João Silva", "11999999999", "123.456.789-00", "12.345.678-9", "01/01/1990");
        Juridica pessoaJuridica = new Juridica("Empresa XYZ", "1133333333", "12.345.678/0001-00", "123456789");

        System.out.println("=== Pessoa Física ===");
        pessoaFisica.exibirInfo();

        System.out.println("\n=== Pessoa Jurídica ===");
        pessoaJuridica.exibirInfo();
    }
}
