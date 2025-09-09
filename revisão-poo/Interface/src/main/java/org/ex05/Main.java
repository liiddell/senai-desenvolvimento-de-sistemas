package org.ex05;

public class Main {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("João", "123.456.789-00", "23456-7", Sexo.MASCULINO, 5000.0, "10/02/2002", "15/03/2023");
        System.out.println(g1);
        System.out.println("------------------------------");
        Diretor d1 = new Diretor("Maria", "987.654.321-00", "76543-2", Sexo.FEMININO, 8000.0, "20/05/1980", "01/01/2020");
        System.out.println(d1);

        System.out.println("------------------------------");
        Motoboy m1 = new Motoboy("Carlos", "111.222.333-44", "11223-3", Sexo.MASCULINO, 2000.0, "15/08/1995", "10/10/2022", "XYZ-1234");
        System.out.println(m1);

        System.out.println("------------------------------");
        d1.admitir(m1);
        d1.demitir(m1);

    }
}
