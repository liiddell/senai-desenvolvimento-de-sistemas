package com.example.alunos.services;

import com.example.alunos.model.Aluno;
import com.example.alunos.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AlunosServices {

    @Autowired
    private AlunoRepository alunoRepository;

    // Listar todos os usuários
    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    // Salvar um novo usuário
    public Aluno salvar(Aluno aluno) {
        // Verifica se o email já está cadastrado
        if (alunoRepository.findByEmail(aluno.getEmail()).isPresent()) {
            throw new RuntimeException("Usuário já cadastrado");
        }
        // Salva o usuário no banco de dados
        return alunoRepository.save(aluno);
    }

    public Aluno atualizar(UUID id, Aluno aluno) {
        // Verifica se o usuário existe
        if(!alunoRepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        // Atualiza o usuário
        aluno.setId(id);
        return alunoRepository.save(aluno);

    }

    public void excluir(UUID id) {
        // Verifica se o usuário existe
        if(!alunoRepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        // Deleta o usuário
        alunoRepository.deleteById(id);
    }
}
