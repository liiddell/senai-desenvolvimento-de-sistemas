package org.ex05;

public class Diretor extends CargoDeConfianca implements Contratacao{
    private static final double PREMIO = 1.1;

    public Diretor(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao, Bonificacao.DIRETOR);
    }

    @Override
    public double getSalarioFinal() {
        return this.salarioBase * this.bonificacao.GERENTE.getValor() * PREMIO;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Diretor " + this.nome + " admitiu o funcionario " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Diretor " + this.nome + " demitiu o funcionario " + funcionario.getNome());
    }


    @Override
    public String toString() {
        return super.toString() +
               "\nCargo: Diretor(a)\n" +
               "Salário Final: R$ " + this.getSalarioFinal() + "\n";
    }
}
