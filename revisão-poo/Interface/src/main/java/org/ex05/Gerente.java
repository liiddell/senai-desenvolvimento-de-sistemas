package org.ex05;

public class Gerente extends CargoDeConfianca {

    public Gerente(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao, Bonificacao.GERENTE);
    }

    @Override
    public double getSalarioFinal() {
        return this.salarioBase * this.bonificacao.getValor();
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nCargo: Gerente\n" +
               "Salário Final: R$" + this.getSalarioFinal() + "\n";
    }


}
