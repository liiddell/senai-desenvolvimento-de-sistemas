package org.ex03;

public class Diretor extends Funcionario implements Contratacao {
    private double premio = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    @Override
    public double getSalarioFinal() {
        return this.salarioBase + (this.salarioBase * premio);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Diretor(a)" + this.nome + " admitiu o funcionario " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Diretor(a) " + this.nome + " demitiu o funcionario " + funcionario.getNome());
    }

    @Override
    public String toString() {
        return "Diretor(a):\n" +
                "Nome: " + nome + "\n" +
                "Data de Nascimento: " + dataNascimento + "\n" +
                "Sexo: " + sexo.getTexto() + "\n" +
                "Setor: " + setor.getNome() + "\n" +
                "Salario Final: " + getSalarioFinal() + "\n";
    }

}
