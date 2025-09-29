package com.example.servicesexceptions.services;

import com.example.servicesexceptions.model.Usuario;
import com.example.servicesexceptions.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsuarioService {

    @Autowired // Construtor
    private UsuarioRepository usuarioRepository;

    // Listar todos os usuários
    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    // Salvar um novo usuário
    public Usuario salvar(Usuario usuario) {
        // Verifica se o email já está cadastrado
        if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) {
            throw new RuntimeException("Usuário já cadastrado");
        }
        // Salva o usuário no banco de dados
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizar(UUID id, Usuario usuario) {
        // Verifica se o usuário existe
        if(!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        // Atualiza o usuário
        usuario.setId(id);
        return usuarioRepository.save(usuario);

    }

    public void excluir(UUID id) {
        // Verifica se o usuário existe
        if(!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        // Deleta o usuário
        usuarioRepository.deleteById(id);
    }

}
