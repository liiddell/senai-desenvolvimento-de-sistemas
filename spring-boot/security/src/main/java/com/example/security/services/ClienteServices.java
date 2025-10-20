package com.example.security.services;

import com.example.security.dto.ClienteRequestDTO;
import com.example.security.dto.ClienteResponseDTO;
import com.example.security.model.ClienteModel;
import com.example.security.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServices {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    public List<ClienteResponseDTO> listar() {
        return clienteRepository.findAll()
                .stream()
                .map(c -> new ClienteResponseDTO(c.getNome(),c.getEmail(), c.getTelefone()))
                .toList();
    }

    public ClienteModel salvar(@Valid ClienteRequestDTO dto) {
        if (clienteRepository.findByEmail(dto.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email já cadastrado");
        }

        ClienteModel cliente = new ClienteModel();
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefone(dto.getTelefone());
        cliente.setFormaPagamento(dto.getFormaPagamento());
        cliente.setEndereco(dto.getEndereco());

        clienteRepository.save(cliente);
        return cliente;
    }

    public ClienteModel atualizar (Long id, @Valid ClienteRequestDTO dto) {
        if (!clienteRepository.existsById(id)){
            throw new RuntimeException("Funcionário não encontrado");
        }

        ClienteModel cliente = new ClienteModel();

        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefone(dto.getTelefone());
        cliente.setFormaPagamento(dto.getFormaPagamento());
        cliente.setEndereco(dto.getEndereco());

        clienteRepository.save(cliente);
        return cliente;
    }

    public void deletar (Long id){
        if (!clienteRepository.existsById(id)){
            throw new IllegalArgumentException("Funcionário não encontrado");
        }
        clienteRepository.deleteById(id);
    }
}
