package Atividade01;

public class Pet {
    private String nome;
    private int idade;
    private String raça, porte, alimentação;

    public Pet(String nome, int idade, String raça, String porte, String alimentação) {
        this.nome = nome;
        this.idade = idade;
        this.raça = raça;
        this.porte = porte;
        this.alimentação = alimentação;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getAlimentação() {
        return alimentação;
    }

    public void setAlimentação(String alimentação) {
        this.alimentação = alimentação;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Raça: " + this.raça);
        System.out.println("Porte: " + this.porte);
        System.out.println("Alimentação: " + this.alimentação);
        System.out.println("-----------------------------");
    }

}
