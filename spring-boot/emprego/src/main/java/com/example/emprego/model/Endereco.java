package com.example.emprego.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tab_endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String cidade;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UnidadeFederativa uf;
}
