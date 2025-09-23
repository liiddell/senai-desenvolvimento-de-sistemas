package com.example.empresaTeste.services;

import com.example.empresaTeste.model.Cliente;
import com.example.empresaTeste.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        if (clienteRepository.findByProtocoloAtendimento(cliente.getProtocoloAtendimento()).isPresent()) {
            throw new RuntimeException("Cliente já existe com este protocolo de atendimento.");
        }
        return clienteRepository.save(cliente);
    }
}
