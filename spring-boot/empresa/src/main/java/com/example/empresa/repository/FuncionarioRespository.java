package com.example.empresa.repository;

import com.example.empresa.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FuncionarioRespository extends JpaRepository <Funcionario, UUID> {
}
