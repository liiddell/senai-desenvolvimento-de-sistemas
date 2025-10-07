package com.example.revisao.services;

import com.example.revisao.model.Veiculos;
import com.example.revisao.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoServices {
    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculos> listarTodos() {
        return veiculoRepository.findAll();
    }

    public Veiculos salvarVeiculo(Veiculos veiculo) {
        if (veiculoRepository.findByModelo(veiculo.getModelo()).isPresent()) {
            throw new IllegalArgumentException("Veículo já cadastrado");
        }
        return veiculoRepository.save(veiculo);
    }

    public Veiculos atualizarVeiculo(Long id, Veiculos veiculo) {
        if (!veiculoRepository.findById(id).isPresent()) {
            throw new IllegalArgumentException("Veículo não cadastrado");
        }
        veiculo.setId(id);
        return veiculoRepository.save(veiculo);
    }

    public void deletarVeiculo(Long id){
        if(!veiculoRepository.findById(id).isPresent()) {
            throw new IllegalArgumentException("Veículo não encontrado");
        }
        veiculoRepository.deleteById(id);
    }
}
