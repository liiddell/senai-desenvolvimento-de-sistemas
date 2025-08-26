package heranca02;

public class Main {
    public static void main(String[] args) {
        Processador p1 = new Processador("JDK", "674-HSTD", "32500");
        Memoria m1 = new Memoria("Kingston", "RTX785", 16);
        PlacaMae pm1 = new PlacaMae("Marca", "Modelo", "E27");
        DispositivoDeArmazenamento da1 = new DispositivoDeArmazenamento("Marca", "modelo", 16, "Bluethooth");


        System.out.printf("Processador:");
        p1.exibirDados();
        System.out.println("=========================");
        System.out.printf("Memória:");
        m1.exibirDados();
        System.out.println("=========================");
        System.out.printf("Placa Mãe:");
        pm1.exibirDados();
        System.out.println("=========================");
        System.out.printf("Dispositivo de Armazenamento:");
        da1.exibirDados();
    }
}
