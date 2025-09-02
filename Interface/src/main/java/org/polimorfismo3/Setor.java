package org.polimorfismo3;

public enum Setor {
    RECURSOS_HUMANOS ("Recursos Humanos"),
    FINANCEIRO ("Financeiro"),
    OPERACOES ("Operações");

    public String nome;

    Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
