package com.example.security.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tab_produto")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 50, unique = true)
    private String lote;

    @Column(nullable = false, length = 20)
    private String validade;

    @Column(nullable = false, length = 100)
    private String categoria;

    @Column(nullable = false)
    private int quantidade;
}
