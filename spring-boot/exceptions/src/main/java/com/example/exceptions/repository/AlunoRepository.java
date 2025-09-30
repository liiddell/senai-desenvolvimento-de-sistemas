package com.example.exceptions.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exceptions.model.Aluno;

public interface AlunoRepository extends JpaRepository <Aluno, UUID>{
    Optional<Aluno> findByEmail(String email);
}
