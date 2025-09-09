package Atividade02;

public class Cliente {
    private  String nome;
    private int idade;
    private String CPF;
    private String telefone;
    private Endereco endereco;

    public Cliente(String nome, int idade, String CPF, String telefone, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.telefone = telefone;
        this.endereco = endereco;
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


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Endereço: " + this.endereco.getRua() + ", " + this.endereco.getNumero() + ", " + this.endereco.getCidade());
    }
}
