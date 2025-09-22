package com.example.relacionamento.model;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private final String texto;

    Sexo(String nome) {
        this.texto = nome;
    }

    public String getTexto() {
        return texto;
    }
}
