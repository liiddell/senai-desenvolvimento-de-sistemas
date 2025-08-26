package heranca03;

public class Main {
    public static void main(String[] args) {
        Camisa camisa = new Camisa("Bilabong", "Preta", "38", 58.90);
        Calca calca = new Calca("Bilabong", "Preta", "38", 78.90);
        Sapato sapato = new Sapato("Bilabong", "Preta", "38", 58.90);

        System.out.println("================");
        System.out.println("CAMISA");
        camisa.exibirDados();
        System.out.println("================");
        System.out.println("CALÇA");
        calca.exibirDados();
        System.out.println("================");
        System.out.println("SAPATO");
        sapato.exibirDados();
    }
}
