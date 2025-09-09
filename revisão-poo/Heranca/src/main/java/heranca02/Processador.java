package heranca02;

public class Processador extends Componente{
    private String frequencia;

    public Processador(String marca, String modelo, String frequencia) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Frequência: "+this.frequencia+"\n");
    }
}
