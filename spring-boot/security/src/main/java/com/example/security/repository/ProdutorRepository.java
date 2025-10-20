package com.example.security.repository;

import com.example.security.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutorRepository extends JpaRepository <ProdutoModel, Long> {
    Optional <ProdutoModel> findByLote (String lote);
}
