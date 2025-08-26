package heranca02;

public class PlacaMae extends Componente{
    private String soquete;

    public PlacaMae(String marca, String modelo, String soquete) {
        super(marca, modelo);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Soquete: " +this.soquete+ "\n");
    }
}
