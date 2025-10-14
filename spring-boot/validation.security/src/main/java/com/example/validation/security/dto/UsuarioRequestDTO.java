package com.example.validation.security.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsuarioRequestDTO {
    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "O email é obrigatório")
    @Email(message = "Deve ser um email válido")
    private String email;

    @NotBlank(message = "A senha é obrigatória")
    @Size (min = 8, message = "A senha deve ter pelo menos 8 caracteres")
    private String senha;


}
