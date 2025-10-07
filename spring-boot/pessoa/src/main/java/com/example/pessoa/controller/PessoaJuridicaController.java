package com.example.pessoa.controller;

import com.example.pessoa.model.PessoaJuridica;
import com.example.pessoa.services.PessoaJuridicaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pessoas-juridicas")
public class PessoaJuridicaController {
    @Autowired
    private PessoaJuridicaServices pessoaJuridicaServices;

    @GetMapping
    public List<PessoaJuridica> listarPessasFisicas(){
        return pessoaJuridicaServices.listarPJ();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvarPF(@RequestBody PessoaJuridica pessoaJuridica){
        pessoaJuridicaServices.salvarPJ(pessoaJuridica);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("message", "Pessoa Física cadastrada com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizarPF(@PathVariable Long id, @RequestBody PessoaJuridica pessoaJuridica){
        pessoaJuridicaServices.atualizarPJ(id, pessoaJuridica);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("message", "Pessoa Física atualizada com sucesso!"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletarPF(@PathVariable Long id){
        pessoaJuridicaServices.deletarPJ(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("message", "Pessoa Física deletada com sucesso!"));
    }
}
