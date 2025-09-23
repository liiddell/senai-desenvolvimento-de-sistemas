package com.example.empresaTeste.repository;

import com.example.empresaTeste.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Long> {
}
