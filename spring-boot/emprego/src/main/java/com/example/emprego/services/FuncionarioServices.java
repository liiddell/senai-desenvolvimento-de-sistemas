package com.example.emprego.services;

import com.example.emprego.model.Funcionario;
import com.example.emprego.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServices {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Funcionario salvarFuncionario(Funcionario funcionario) {
        if(funcionarioRepository.findByEmail(funcionario.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email já cadastrado");
        }
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario atualizarFuncionario(Long id, Funcionario funcionario){
        if(!funcionarioRepository.findByEmail(funcionario.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email não cadastrado");
        }
        funcionario.setId(id);
        return funcionarioRepository.save(funcionario);
    }

    public void deletarFuncionario(Long id) {
        if(!funcionarioRepository.findById(id).isPresent()) {
            throw new IllegalArgumentException("Funcionário não encontrado");
        }
        funcionarioRepository.deleteById(id);
    }
}
