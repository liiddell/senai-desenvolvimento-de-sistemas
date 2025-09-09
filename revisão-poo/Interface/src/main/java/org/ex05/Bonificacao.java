package org.ex05;

public enum Bonificacao {
    GERENTE(1.2),
    DIRETOR(1.4);

    public double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
