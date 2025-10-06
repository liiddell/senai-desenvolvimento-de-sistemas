package com.example.emprego.repository;

import com.example.emprego.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository <Funcionario, Long> {
    Optional<Funcionario> findByEmail(String email);
}
