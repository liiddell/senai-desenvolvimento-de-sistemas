package org.ex03;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("João", "15/03/1990", Sexo.MASCULINO, Setor.OPERACOES, 2000.0, "AB123456");
        Diretor diretor = new Diretor("Maria", "22/07/1980", Sexo.FEMININO, Setor.FINANCEIRO, 8000.0);

        System.out.println(diretor);
        System.out.println(motoboy);

        diretor.admitir(motoboy);
        diretor.demitir(motoboy);
    }
}
