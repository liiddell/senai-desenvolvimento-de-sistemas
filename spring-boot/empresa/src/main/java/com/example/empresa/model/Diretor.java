package com.example.empresa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "tab_diretores")
public class Diretor extends Funcionario{
    @Column(name = "premio", nullable = false)
    private double premio = 0.2;

    public Diretor() {
        super();
    }

    public Diretor(UUID id, String nome, String dataNascimento, Sexo sexo, Setor setor, Double salarioBase, double premio) {
        super(id, nome, dataNascimento, sexo, setor, salarioBase);
        this.premio = premio;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }
}
