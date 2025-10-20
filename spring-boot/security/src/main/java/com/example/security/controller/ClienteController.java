package com.example.security.controller;

import com.example.security.dto.ClienteRequestDTO;
import com.example.security.dto.ClienteResponseDTO;
import com.example.security.dto.FuncionarioRequestDTO;
import com.example.security.dto.FuncionarioResponseDTO;
import com.example.security.services.ClienteServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteServices clienteServices;

    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>> listar() {
        return ResponseEntity
                .ok()
                .body(clienteServices.listar());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody ClienteRequestDTO clienteRequestDTO) {
        clienteServices.salvar(clienteRequestDTO);

        return ResponseEntity
                .ok()
                .body(Map.of(
                        "menssagem", "Funcionário cadastrado com sucesso",
                        "sucesso", "true"
                ));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable Long id, @Valid @RequestBody ClienteRequestDTO clienteRequestDTO) {
        clienteServices.atualizar(id, clienteRequestDTO);

        return ResponseEntity
                .ok()
                .body(Map.of(
                        "menssagem", "Funcionário atualizado com sucesso",
                        "sucesso", "true"
                ));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletar(@PathVariable Long id) {
        clienteServices.deletar(id);

        return ResponseEntity
                .ok()
                .body(Map.of(
                        "menssagem", "Funcionário deletado com sucesso",
                        "sucesso", "true"
                ));
    }
}
