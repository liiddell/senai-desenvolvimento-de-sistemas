package com.example.consumoDeApi.services;

import com.example.consumoDeApi.dto.UsuarioRequestDTO;
import com.example.consumoDeApi.dto.UsuarioResponseDTO;
import com.example.consumoDeApi.model.UsuarioModel;
import com.example.consumoDeApi.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServices {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public List<UsuarioResponseDTO> listar() {
        return usuarioRepository.findAll()
                .stream()
                .map(u -> new UsuarioResponseDTO(u.getNome(), u.getEmail()))
                .toList();
    }

    public UsuarioModel salvar(@Valid UsuarioRequestDTO dto) {
        if (usuarioRepository.findByEmail(dto.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email já cadastrado");
        }

        UsuarioModel usuario = new UsuarioModel();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(passwordEncoder.encode(dto.getSenha()));

        usuarioRepository.save(usuario);
        return usuario;
    }

    public UsuarioModel atualizar (Long id, @Valid UsuarioRequestDTO dto) {
        if (!usuarioRepository.existsById(id)){
            throw new RuntimeException("Usuário não encontrado");
        }

        UsuarioModel usuario = new UsuarioModel();

        usuario.setId(id);

        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());

        usuarioRepository.save(usuario);
        return usuario;
    }

    public void deletar (Long id){
        if (!usuarioRepository.existsById(id)){
            throw new RuntimeException("Usuário não encontrado");
        }
        usuarioRepository.deleteById(id);
    }
}
