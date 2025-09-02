package org.ex03;

public class Motoboy extends Funcionario {
    private String carteiraDeHabilitacao;

    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return this.salarioBase;
    }

    @Override
    public String toString() {
        return "Motoboy:\n" +
                "Nome: " + nome + "\n" +
                "Data de Nascimento: " + dataNascimento + "\n" +
                "Sexo: " + sexo.getTexto() + "\n" +
                "Setor: " + setor.getNome() + "\n" +
                "Salario Final: " + getSalarioFinal() + "\n" +
                "Carteira de Habilitacao: " + carteiraDeHabilitacao + "\n";
    }
}
