package com.example.empresa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "tab_motoboys")
public class Motoboy extends Funcionario{
    @Column(name = "cnh", nullable = false, length = 20)
    private String carteiraDeHabilitacao;

    public Motoboy() {
        super();
    }
    public Motoboy(UUID id, String nome, String dataNascimento, Sexo sexo, Setor setor, Double salarioBase, String carteiraDeHabilitacao) {
        super(id, nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
}
