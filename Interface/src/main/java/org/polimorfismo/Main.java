package org.polimorfismo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exemplos de Polimorfismo em Java");
        Cachorro cachorro = new Cachorro();
        System.out.println("Som do cachorro:");
        System.out.println(cachorro.emitirSom());
        System.out.println("-------------------");

        Gato gato = new Gato();
        System.out.println("Som do gato:");
        System.out.println(gato.emitirSom());

        System.out.println("-------------------");
        Galo galo = new Galo();
        System.out.println("Som do galo:");
        System.out.println(galo.emitirSom());

        System.out.println("-------------------");
        Pato pato = new Pato();
        System.out.println("Som do pato:");
        System.out.println(pato.emitirSom());
    }
}
