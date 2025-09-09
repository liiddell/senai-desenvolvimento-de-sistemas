public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Jorge", 30);
        c1.exibirDados();
        Produto p1 = new Produto("Notebook", 3500.00);
        p1.exibirDados();
        System.out.println("-------------------");
        Cliente c2 = new Cliente("Ana", 25);
        c2.exibirDados();
        Produto p2 = new Produto("Smartphone", 1500.00);
        p2.exibirDados();
        System.out.println("-------------------");
    }
}
