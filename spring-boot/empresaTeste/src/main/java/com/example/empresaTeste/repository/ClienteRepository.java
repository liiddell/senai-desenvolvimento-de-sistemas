package com.example.empresaTeste.repository;

import com.example.empresaTeste.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
