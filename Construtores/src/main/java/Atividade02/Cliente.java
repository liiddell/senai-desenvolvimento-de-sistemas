package Atividade02;

public class Cliente {
    private  String nome;
    private int idade;
    private String CPF;
    private String endereço;
    private String telefone;

    public Cliente(String nome, int idade, String CPF, String endereço, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.endereço = endereço;
        this.telefone = telefone;
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Endereço: " + this.endereço);
        System.out.println("Telefone: " + this.telefone);
    }
}
