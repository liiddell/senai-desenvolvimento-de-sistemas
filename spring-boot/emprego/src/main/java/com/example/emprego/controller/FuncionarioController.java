package com.example.emprego.controller;

import com.example.emprego.model.Funcionario;
import com.example.emprego.services.FuncionarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioServices funcionarioServices;

    @GetMapping
    public List<Funcionario> listarFuncionarios() {
        return funcionarioServices.listarFuncionarios();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody Funcionario funcionario){
        funcionarioServices.salvarFuncionario(funcionario);
        return ResponseEntity
                .status(201)
                .body(Map.of("message", "Funcionário cadastrado com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable Long id, @RequestBody Funcionario funcionario) {
        funcionarioServices.atualizarFuncionario(id, funcionario);
        return ResponseEntity
                .status(200)
                .body(Map.of("message", "Funcionário atualizado com sucesso!"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletar(@PathVariable Long id) {
        funcionarioServices.deletarFuncionario(id);
        return ResponseEntity
                .status(200)
                .body(Map.of("message", "Funcionário deletado com sucesso!"));
    }

}
