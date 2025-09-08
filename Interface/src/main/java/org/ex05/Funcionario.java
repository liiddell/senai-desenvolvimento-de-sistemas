package org.ex05;

public abstract class Funcionario implements SalarioFinal {

    protected String nome;
    protected String cpf;
    protected String rg;
    protected Sexo sexo;
    protected double salarioBase;
    protected String dataNascimento;
    protected String dataAdmissao;

    public Funcionario(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.salarioBase = salarioBase;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public double getSalarioFinal() {
        return this.salarioBase;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "CPF: " + this.cpf + "\n" +
                "RG: " + this.rg + "\n" +
                "Sexo: " + this.sexo.getTexto() + "\n" +
                "Salário Base: R$ " + String.format("%.2f", this.salarioBase) + "\n" +
                "Data de Nascimento: " + this.dataNascimento + "\n" +
                "Data de Admissão: " + this.dataAdmissao;
    }
}
