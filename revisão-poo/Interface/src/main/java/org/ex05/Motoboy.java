package org.ex05;

public class Motoboy extends Funcionario {
    private String placaDaMoto;

    public Motoboy(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, String placaDaMoto)  {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double getSalarioFinal() {
        return this.salarioBase;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPlaca da Moto: " + this.placaDaMoto + "\n";
    }
}
