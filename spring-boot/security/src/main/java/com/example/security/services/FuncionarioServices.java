package com.example.security.services;

import com.example.security.dto.FuncionarioRequestDTO;
import com.example.security.dto.FuncionarioResponseDTO;
import com.example.security.model.FuncionarioModel;
import com.example.security.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServices {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    public List<FuncionarioResponseDTO> listar() {
        return funcionarioRepository.findAll()
                .stream()
                .map(f -> new FuncionarioResponseDTO(f.getNome(), f.getEmail()))
                .toList();
    }

    public FuncionarioModel salvarFuncionario(@Valid FuncionarioRequestDTO funcionarioRequestDTO) {
        if (funcionarioRepository.findByEmail(funcionarioRequestDTO.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email já cadastrado");
        }

        FuncionarioModel funcionario = new FuncionarioModel();
        funcionario.setNome(funcionarioRequestDTO.getNome());
        funcionario.setEmail(funcionarioRequestDTO.getEmail());
        funcionario.setSenha(bCryptPasswordEncoder.encode(funcionarioRequestDTO.getSenha()));

        funcionarioRepository.save(funcionario);
        return funcionario;
    }

    public FuncionarioModel atualizarFuncionario (Long id, @Valid FuncionarioRequestDTO funcionarioRequestDTO) {
        if (!funcionarioRepository.existsById(id)){
            throw new RuntimeException("Funcionário não encontrado");
        }

        FuncionarioModel atualizarFuncionario = new FuncionarioModel();

        atualizarFuncionario.setId(id);
        atualizarFuncionario.setNome(funcionarioRequestDTO.getNome());
        atualizarFuncionario.setEmail(funcionarioRequestDTO.getEmail());
        atualizarFuncionario.setSenha(bCryptPasswordEncoder.encode(funcionarioRequestDTO.getSenha()));

        funcionarioRepository.save(atualizarFuncionario);
        return atualizarFuncionario;
    }

    public void deletarFuncionario (Long id){
        if (!funcionarioRepository.existsById(id)){
            throw new IllegalArgumentException("Funcionário não encontrado");
        }
        funcionarioRepository.deleteById(id);
    }
}
