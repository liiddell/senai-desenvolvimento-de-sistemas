package org.ex04;

public abstract class Funcionario {
    protected String nome, dataNascimento;
    protected double salarioBase;

    public Funcionario(String nome, String dataNascimento, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario:\n" +
                "Nome: " + this.nome + "\n" +
                "Data de Nascimento: " + this.dataNascimento + "\n" +
                "Salario Base: " + this.salarioBase + "\n";
    }
}

