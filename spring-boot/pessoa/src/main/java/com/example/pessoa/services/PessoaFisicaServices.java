package com.example.pessoa.services;

import com.example.pessoa.model.PessoaFisica;
import com.example.pessoa.repository.PessoaFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PessoaFisicaServices {
    @Autowired
    private PessoaFisicaRepository pessoaFisicaRepository;

    public List<PessoaFisica> listarPessoasFisicas() {
        return pessoaFisicaRepository.findAll();
    }

    public PessoaFisica salvarPF(PessoaFisica pessoaFisica) {
        if (pessoaFisicaRepository.findByCpf(pessoaFisica.getCpf()).isPresent()) {
            throw new IllegalArgumentException("CPF já cadastrado");
        }
        if (pessoaFisicaRepository.findByRg(pessoaFisica.getRg()).isPresent()) {
            throw new IllegalArgumentException("RG já cadastrado");
        }
        return pessoaFisicaRepository.save(pessoaFisica);
    }


    public PessoaFisica atualizarPF(Long id, PessoaFisica pessoafisica) {
        if (!pessoaFisicaRepository.findById(id).isPresent()) {
            throw new IllegalArgumentException("Pessoa Física não encontrada");
        }
        pessoafisica.setId(id);
        return pessoaFisicaRepository.save(pessoafisica);
    }

    public void deletarPF(Long id) {
        if (!pessoaFisicaRepository.findById(id).isPresent()) {
            throw new IllegalArgumentException("Pessoa Física não encontrada");
        }
        pessoaFisicaRepository.deleteById(id);
    }
}
