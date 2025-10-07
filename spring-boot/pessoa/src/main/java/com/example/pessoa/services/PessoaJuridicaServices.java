package com.example.pessoa.services;

import com.example.pessoa.model.PessoaJuridica;
import com.example.pessoa.repository.PessoaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaJuridicaServices {
    @Autowired
    private PessoaJuridicaRepository pessoaJuridicaRepository;

    public List<PessoaJuridica> listarPJ(){
        return pessoaJuridicaRepository.findAll();
    }

    public PessoaJuridica salvarPJ(PessoaJuridica pessoaJuridica){
        if(pessoaJuridicaRepository.findByCnpj(pessoaJuridica.getCnpj()).isPresent()){
            throw new IllegalArgumentException("CNPJ já cadastrado");
        }
        if(pessoaJuridicaRepository.findByInscricaoEstadual(pessoaJuridica.getInscricaoEstadual()).isPresent()){
            throw new IllegalArgumentException("Inscrição Estadual já cadastrada");
        }
        return pessoaJuridicaRepository.save(pessoaJuridica);
    }

    public PessoaJuridica atualizarPJ(Long id, PessoaJuridica pessoaJuridica){
        if(!pessoaJuridicaRepository.findById(id).isPresent()){
            throw new IllegalArgumentException("Pessoa Jurídica não encontrada");
        }
        pessoaJuridica.setId(id);
        return pessoaJuridicaRepository.save(pessoaJuridica);
    }

    public void deletarPJ(Long id){
        if(!pessoaJuridicaRepository.findById(id).isPresent()){
            throw new IllegalArgumentException("Pessoa Jurídica não encontrada");
        }
        pessoaJuridicaRepository.deleteById(id);
    }
}
