package com.example.revisao.repository;

import com.example.revisao.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long> {
    Optional<Produto> findByNome(String nome);
}
