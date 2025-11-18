package com.example.consumoDeApi.controller;

import com.example.consumoDeApi.dto.UsuarioRequestDTO;
import com.example.consumoDeApi.dto.UsuarioResponseDTO;
import com.example.consumoDeApi.services.UsuarioServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://localhost:5173")
public class UsuarioController {
    @Autowired
    private UsuarioServices usuarioServices;


    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listar() {
        return ResponseEntity
                .ok()
                .body(usuarioServices.listar());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody UsuarioRequestDTO clienteRequestDTO) {
        usuarioServices.salvar(clienteRequestDTO);

        return ResponseEntity
                .ok()
                .body(Map.of(
                        "menssagem", "Funcionário cadastrado com sucesso",
                        "sucesso", "true"
                ));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable Long id, @Valid @RequestBody UsuarioRequestDTO usuarioRequestDTO) {
        usuarioServices.atualizar(id, usuarioRequestDTO);

        return ResponseEntity
                .ok()
                .body(Map.of(
                        "menssagem", "Funcionário atualizado com sucesso",
                        "sucesso", "true"
                ));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletar(@PathVariable Long id) {
        usuarioServices.deletar(id);

        return ResponseEntity
                .ok()
                .body(Map.of(
                        "menssagem", "Funcionário deletado com sucesso",
                        "sucesso", "true"
                ));
    }
}
