package com.example.empresaTeste.repository;

import com.example.empresaTeste.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByProtocoloAtendimento(String protocoloAtendimento);
}
