package com.example.security.controller;

import com.example.security.dto.ProdutoRequestDTO;
import com.example.security.dto.ProdutoResponseDTO;
import com.example.security.services.ProdutoServices;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<List<ProdutoResponseDTO>> listar(){
        return ResponseEntity
                .ok()
                .body(produtoServices.listar());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody ProdutoRequestDTO produtoRequestDTO){
        produtoServices.salvar(produtoRequestDTO);

        return ResponseEntity
                .ok()
                .body(Map.of(
                        "menssagem", "Produto cadastrado com sucesso",
                        "sucesso", "true"
                ));
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable Long id, @RequestBody ProdutoRequestDTO produtoRequestDTO) {
        produtoServices.atualizar(id, produtoRequestDTO);
        return ResponseEntity
                .ok()
                .body(Map.of(
                        "menssagem", "Produto atualizado com sucesso",
                        "sucesso", "true"
                ));
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> deletar(@PathVariable Long id){
        produtoServices.deletar(id);
        return ResponseEntity
                .ok()
                .body(Map.of(
                        "menssagem", "Produto deletado com sucesso",
                        "sucesso", "true"
                ));
    }
}
