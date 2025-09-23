package com.example.empresaTeste.repository;

import com.example.empresaTeste.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
}
