package com.example.pessoa.repository;

import com.example.pessoa.model.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaJuridicaRepository extends JpaRepository <PessoaJuridica, Long> {
    Optional<PessoaJuridica> findByCnpj(String cnpj);
    Optional<PessoaJuridica> findByInscricaoEstadual(String inscricaoEstadual);
}
