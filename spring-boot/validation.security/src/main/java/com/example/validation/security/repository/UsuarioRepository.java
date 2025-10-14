package com.example.validation.security.repository;

import com.example.validation.security.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long> {
    Optional<UsuarioModel> findByEmail(String email);
}
