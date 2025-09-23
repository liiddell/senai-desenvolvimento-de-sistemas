package com.example.empresaTeste.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false, length = 100)
    private String nome;
    @Column(name = "dataNascimento", nullable = false, length = 20)
    private String dataNascimento;
    @Column(name = "protocolo_atendimento", nullable = false, unique = true, length = 20)
    private String protocoloAtendimento;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String dataNascimento, String protocoloAtendimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
}
