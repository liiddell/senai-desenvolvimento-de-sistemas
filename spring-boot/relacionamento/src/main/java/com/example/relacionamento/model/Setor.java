package com.example.relacionamento.model;

public enum Setor {
    RECURSOS_HUMANOS ("Recursos Humanos"),
    FINANCEIRO ("Financeiro"),
    OPERACOES ("Operações");

    private final String texto;

    Setor(String nome) {
        this.texto = nome;
    }

    public String getTexto() {
        return texto;
    }
}
