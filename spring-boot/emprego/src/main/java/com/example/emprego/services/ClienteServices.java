package com.example.emprego.services;

import com.example.emprego.model.Cliente;
import com.example.emprego.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServices {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente salvarCliente(Cliente cliente) {
        if(clienteRepository.findByEmail(cliente.getEmail()).isPresent()){
            throw new IllegalArgumentException("Email já cadastrado");
        }
        return clienteRepository.save(cliente);
    }

    public Cliente atualizarCliente(Long id, Cliente cliente){
        if(!clienteRepository.findByEmail(cliente.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email não cadastrado");
        }
        cliente.setId(id);
        return clienteRepository.save(cliente);
    }

    public void deletarCliente(Long id) {
        if(!clienteRepository.findById(id).isPresent()) {
            throw new IllegalArgumentException("Cliente não encontrado");
        }
        clienteRepository.deleteById(id);
    }
}
