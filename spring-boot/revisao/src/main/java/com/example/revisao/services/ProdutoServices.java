package com.example.revisao.services;

import com.example.revisao.model.Produto;
import com.example.revisao.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServices {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Produto salvarProduto(Produto produto) {
        if (produtoRepository.findByNome(produto.getNome()).isPresent()) {
            throw new IllegalArgumentException("Produto já cadastrado");
        }
        return produtoRepository.save(produto);
    }

    public Produto atualizarProduto(Long id, Produto produto) {
        if (!produtoRepository.findById(id).isPresent()) {
            throw new IllegalArgumentException("Produto não cadastrado");
        }
        produto.setId(id);
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id) {
        if (!produtoRepository.findById(id).isPresent()) {
            throw new IllegalArgumentException("Produto não encontrado");
        }
        produtoRepository.deleteById(id);
    }
}

