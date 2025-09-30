package com.example.alunos.controller;

import com.example.alunos.model.Aluno;
import com.example.alunos.services.AlunosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping ("/alunos")
public class AlunoController {
    @Autowired
    private AlunosServices alunoServices;

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoServices.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Aluno> salvar(@RequestBody Aluno aluno) {
        alunoServices.salvar(aluno);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(aluno);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> atualizar(@PathVariable UUID id, @RequestBody Aluno aluno) {
        alunoServices.atualizar(id, aluno);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(aluno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        alunoServices.excluir(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }

}
