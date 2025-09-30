package com.example.alunos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tab_alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column (name = nome, nullable = false, length = 100)
    private String nome;

    @Column (name = telefone, nullable = false, length = 15)
    private String telefone;

    @Column (name = email, nullable = false, length = 100, unique = true)
    private String email;

    @Column (name = senha, nullable = false, length = 100)
    private String senha;


}
