package com.example.security.services;

import com.example.security.dto.ClienteRequestDTO;
import com.example.security.dto.ClienteResponseDTO;
import com.example.security.dto.ProdutoRequestDTO;
import com.example.security.dto.ProdutoResponseDTO;
import com.example.security.model.ClienteModel;
import com.example.security.model.ProdutoModel;
import com.example.security.repository.ProdutorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServices {
    @Autowired
    private ProdutorRepository produtorRepository;

    public List<ProdutoResponseDTO> listar() {
        return produtorRepository.findAll()
                .stream()
                .map(p -> new ClienteResponseDTO(p.getNome(),p.getLote(), p.getValidade(), p.getCategoria()))
                .toList();
    }

    public ProdutoModel salvar(@Valid ProdutoRequestDTO dto) {
        if (produtorRepository.findByLote(dto.getLote()).isPresent()) {
            throw new IllegalArgumentException("Lote já cadastrado");
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
