package com.example.revisao.controller;

import com.example.revisao.model.Veiculos;
import com.example.revisao.services.VeiculoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    @Autowired
    private VeiculoServices veiculoServices;


    @GetMapping
    public List<Veiculos> listarVeiculos(){
        return veiculoServices.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvarVeiculo(@RequestBody Veiculos veiculo){
        veiculoServices.salvarVeiculo(veiculo);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("message", "Veículo cadastrado com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizarVeiculo(@PathVariable Long id, @RequestBody Veiculos veiculo) {
        veiculoServices.atualizarVeiculo(id, veiculo);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("message", "Veículo atualizado com sucesso!"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletarVeiculo(@PathVariable Long id) {
        veiculoServices.deletarVeiculo(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("message", "Veículo deletado com sucesso!"));
    }

}
