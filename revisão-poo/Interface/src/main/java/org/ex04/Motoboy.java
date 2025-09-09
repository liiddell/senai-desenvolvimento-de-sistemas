package org.ex04;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String nome, String dataNascimento, double salarioBase, String placaDaMoto) {
        super(nome, dataNascimento, salarioBase);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }


    @Override
    public String toString() {
        return "Motoboy:\n" +
                "Nome: " + this.nome + "\n" +
                "Data de Nascimento: " + this.dataNascimento + "\n" +
                "Salario Base: " + this.salarioBase + "\n" +
                "Placa da Moto: " + this.placaDaMoto + "\n";
    }
}
