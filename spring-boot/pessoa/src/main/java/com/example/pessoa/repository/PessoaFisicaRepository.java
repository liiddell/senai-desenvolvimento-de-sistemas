package com.example.pessoa.repository;

import com.example.pessoa.model.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaFisicaRepository extends JpaRepository <PessoaFisica, Long> {
    Optional<PessoaFisica> findByCpf(String cpf);
    Optional<PessoaFisica> findByRg(String rg);
}
