package com.example.revisao.controller;

import com.example.revisao.model.Produto;
import com.example.revisao.services.ProdutoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoServices produtoServices;

    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoServices.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvarProduto(@RequestBody Produto produto){
        produtoServices.salvarProduto(produto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("message", "Produto cadastrado com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        produtoServices.atualizarProduto(id, produto);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("message", "Produto atualizado com sucesso!"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>> deletarProduto(@PathVariable Long id) {
        produtoServices.deletarProduto(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("message", "Produto deletado com sucesso!"));
    }
}
