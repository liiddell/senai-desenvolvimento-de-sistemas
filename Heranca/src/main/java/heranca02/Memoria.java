package heranca02;

public class Memoria extends Componente{
    private int capacidadeArmazenamento;

    public Memoria(String marca, String modelo, int capacidadeArmazenamento) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Capacidade de armazenamento: "+this.capacidadeArmazenamento+" gb\n");
    }
}
