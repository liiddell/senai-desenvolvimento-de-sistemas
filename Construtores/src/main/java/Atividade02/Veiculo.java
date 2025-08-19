package Atividade02;

public class Veiculo {
    private String placa, cor;
    private int numeroDePassageiros;
    private int capacidadeDoTanque;
    private int velocidadeMaxima;
    private double consumoMedio;

    public Veiculo(String placa, String cor, int numeroDePassageiros, int capacidadeDoTanque, int velocidadeMaxima, double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

    public void setNumeroDePassageiros(int numeroDePassageiros) {
        this.numeroDePassageiros = numeroDePassageiros;
    }

    public int getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }


    public void exibirDados() {
        System.out.println("Placa: " + this.placa);
        System.out.println("Cor: " + this.cor);
        System.out.println("Número de Passageiros: " + this.numeroDePassageiros);
        System.out.println("Capacidade do Tanque: " + this.capacidadeDoTanque + " litros");
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima + " km/h");
        System.out.println("Consumo Médio: " + this.consumoMedio + " km/l");
    }
}
