package org.ex04;

public class Gerente extends CargoDeConfianca implements Contratacao {

    public Gerente(String nome, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, dataNascimento, salarioBase, bonificacao);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Gerente " + this.nome + " admitiu o funcionario " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Gerente " + this.nome + " demitiu o funcionario " + funcionario.getNome());
    }

    @Override
    public String toString() {
        return "Gerente:\n" +
                "Nome: " + this.nome + "\n" +
                "Data de Nascimento: " + this.dataNascimento + "\n" +
                "Salario Base: " + this.salarioBase + "\n" +
                "Bonificacao: " + this.bonificacao.getValor() + "%\n" +
                "Salario Final: " + (this.getSalarioBase()*this.bonificacao.getValor()) + "\n";
    }


}

