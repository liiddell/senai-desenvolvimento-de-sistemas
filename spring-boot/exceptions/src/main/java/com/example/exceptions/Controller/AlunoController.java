package com.example.exceptions.controller;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exceptions.model.Aluno;
import com.example.exceptions.services.AlunoServices;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServices alunoServices;


    @GetMapping
    public List<Aluno> listarAlunos(){
        return alunoServices.listarAlunos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody Aluno aluno){
        alunoServices.salvar(aluno);

        return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(Map.of("message", "Aluno cadastrado com sucesso!"));
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable UUID id, @RequestBody Aluno aluno){
        alunoServices.atualizarAluno(id, aluno);

        return ResponseEntity
        .status(HttpStatus.OK)
        .body(Map.of("message", "Aluno atualizado com sucesso!"));
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable UUID id){
        alunoServices.excluir(id);

        return ResponseEntity
        .status(HttpStatus.OK)
        .body(Map.of("message", "Aluno excluído com sucesso!"));
    }

}
