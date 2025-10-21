package com.example.security.services;

import com.example.security.dto.ProdutoRequestDTO;
import com.example.security.dto.ProdutoResponseDTO;
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
                .map(p -> new ProdutoResponseDTO(p.getNome(), p.getLote(), p.getValidade(), p.getCategoria(), p.getQuantidade()))
                .toList();
    }

    public ProdutoModel salvar(@Valid ProdutoRequestDTO dto) {
        if (produtorRepository.findByLote(dto.getLote()).isPresent()) {
            throw new IllegalArgumentException("Lote já cadastrado");
        }

        ProdutoModel produto = new ProdutoModel();
        produto.setNome(dto.getNome());
        produto.setLote(dto.getLote());
        produto.setValidade(dto.getValidade());
        produto.setCategoria(dto.getCategoria());
        produto.setQuantidade(dto.getQuantidade());

        produtorRepository.save(produto);
        return produto;
    }

    public ProdutoModel atualizar (Long id, @Valid ProdutoRequestDTO dto) {
        if (!produtorRepository.existsById(id)){
            throw new RuntimeException("Produto não encontrado");
        }

        ProdutoModel produto = new ProdutoModel();

        produto.setNome(dto.getNome());
        produto.setLote(dto.getLote());
        produto.setValidade(dto.getValidade());
        produto.setCategoria(dto.getCategoria());
        produto.setQuantidade(dto.getQuantidade());

        produtorRepository.save(produto);
        return produto;
    }

    public void deletar (Long id){
        if (!produtorRepository.existsById(id)){
            throw new IllegalArgumentException("Produto não encontrado");
        }
        produtorRepository.deleteById(id);
    }
}
