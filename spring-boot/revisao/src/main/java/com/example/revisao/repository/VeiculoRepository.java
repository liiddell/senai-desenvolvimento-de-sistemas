package com.example.revisao.repository;

import com.example.revisao.model.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VeiculoRepository extends JpaRepository <Veiculos, Long> {
    Optional<Veiculos> findByModelo(String modelo);
}
