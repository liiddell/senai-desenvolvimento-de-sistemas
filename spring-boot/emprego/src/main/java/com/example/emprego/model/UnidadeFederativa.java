package com.example.emprego.model;

public enum UnidadeFederativa {
    BAHIA("BA"),
    SAO_PAULO("SP"),
    RIO_DE_JANEIRO("RJ");

    public String sigla;

    UnidadeFederativa(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
}
