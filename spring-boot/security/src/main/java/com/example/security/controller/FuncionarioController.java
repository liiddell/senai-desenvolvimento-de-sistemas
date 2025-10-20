package com.example.security.controller;

import com.example.security.dto.FuncionarioRequestDTO;
import com.example.security.dto.FuncionarioResponseDTO;
import com.example.security.services.FuncionarioServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping ("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioServices funcionarioService;

    @GetMapping
    public ResponseEntity<List<FuncionarioResponseDTO>> listar() {
        return ResponseEntity
                .ok()
                .body(funcionarioService.listar());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody FuncionarioRequestDTO funcionarioRequestDTO) {
        funcionarioService.salvarFuncionario(funcionarioRequestDTO);

        return ResponseEntity
                .ok()
                .body(Map.of(
                        "menssagem", "Funcionário cadastrado com sucesso",
                        "sucesso", "true"
                ));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable Long id, @Valid @RequestBody FuncionarioRequestDTO funcionarioRequestDTO) {
        funcionarioService.atualizarFuncionario(id, funcionarioRequestDTO);

        return ResponseEntity
                .ok()
                .body(Map.of(
                        "menssagem", "Funcionário atualizado com sucesso",
                        "sucesso", "true"
                ));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletar(@PathVariable Long id) {
        funcionarioService.deletarFuncionario(id);

        return ResponseEntity
                .ok()
                .body(Map.of(
                        "menssagem", "Funcionário deletado com sucesso",
                        "sucesso", "true"
                ));
    }
}
