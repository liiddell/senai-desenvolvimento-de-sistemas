package org.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        System.out.println("Som do cachorro:");
        System.out.println(cachorro.emitirSom());

        Gato gato = new Gato();
        System.out.println("Som do gato:");
        System.out.println(gato.emitirSom());
    }
}
