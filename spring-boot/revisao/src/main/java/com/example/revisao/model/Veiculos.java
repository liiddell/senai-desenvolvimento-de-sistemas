package com.example.revisao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tab_veiculos")
public class Veiculos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String marca;
    @Column(nullable = false, length = 100)
    private String fabricante;
    @Column(nullable = false, length = 100)
    private String modelo;
    @Column(nullable = false)
    private double preco;
}
