public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Jorge", 30);
        c1.exibirDados();

        System.out.println("-------------------");
        Produto p1 = new Produto("Notebook", 3500.00);
        p1.exibirDados();
    }
}
