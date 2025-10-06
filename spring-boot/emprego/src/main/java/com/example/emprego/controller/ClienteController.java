package com.example.emprego.controller;

import com.example.emprego.model.Cliente;
import com.example.emprego.services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public List<Cliente> listarClientes() {
        return clienteServices.listarClientes();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody Cliente cliente){
        clienteServices.salvarCliente(cliente);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("message", "Aluno cadastrado com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        clienteServices.atualizarCliente(id, cliente);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("message", "Cliente atualizado com sucesso!"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletar(@PathVariable Long id) {
        clienteServices.deletarCliente(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("message", "Cliente deletado com sucesso!"));
    }
}
