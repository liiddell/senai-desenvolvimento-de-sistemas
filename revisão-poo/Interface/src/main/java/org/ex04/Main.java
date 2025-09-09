package org.ex04;

public class Main {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("Alice", "01/01/1980", 5000.0, Bonificacao.GERENTE);
        System.out.println(g1);

        Gerente g2 = new Gerente("Carlos", "10/10/1975", 6000.0, Bonificacao.DIRETOR);
        System.out.println(g2);

        Motoboy m1 = new Motoboy("Bob", "02/02/1990", 2000.0, "XYZ1234");
        System.out.println(m1);

        g1.admitir(m1);
        g2.demitir(m1);
    }
}
