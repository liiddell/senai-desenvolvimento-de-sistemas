package com.example.emprego.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "tab_funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    private String matricula;
    @Column(nullable = false)
    private String dataNascimento;
    @Column(nullable = false)
    private double salario;
    @Column(nullable = false, unique = true)
    private String email;
}
