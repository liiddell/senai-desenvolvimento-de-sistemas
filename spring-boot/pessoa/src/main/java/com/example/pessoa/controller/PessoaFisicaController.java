package com.example.pessoa.controller;

import com.example.pessoa.model.PessoaFisica;
import com.example.pessoa.services.PessoaFisicaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pessoas-fisicas")
public class PessoaFisicaController {
    @Autowired
    private PessoaFisicaServices pessoaFisicaServices;

    @GetMapping
    public List<PessoaFisica> listarPessasFisicas(){
        return pessoaFisicaServices.listarPessoasFisicas();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvarPF(@RequestBody PessoaFisica pessoaFisica){
        pessoaFisicaServices.salvarPF(pessoaFisica);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("message", "Pessoa Física cadastrada com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizarPF(@PathVariable Long id, @RequestBody PessoaFisica pessoaFisica){
        pessoaFisicaServices.atualizarPF(id, pessoaFisica);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("message", "Pessoa Física atualizada com sucesso!"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletarPF(@PathVariable Long id){
        pessoaFisicaServices.deletarPF(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("message", "Pessoa Física deletada com sucesso!"));
    }
 }
