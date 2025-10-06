package com.example.emprego.repository;

import com.example.emprego.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Long> {
    Optional<Funcionario> findByEmail(String email);
}
