package com.example.empresa.controller;

import com.example.empresa.model.Funcionario;
import com.example.empresa.repository.FuncionarioRespository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    private FuncionarioRespository funcionarioRespository;

    public FuncionarioController(FuncionarioRespository funcionarioRespository) {
        this.funcionarioRespository = funcionarioRespository;
    }

    @GetMapping
    public List<Funcionario> listar() {
        return funcionarioRespository.findAll();
    }

    @PostMapping
    public ResponseEntity<Funcionario> salvar(@RequestBody Funcionario funcionario) {
        funcionarioRespository.save(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);
    }
}
