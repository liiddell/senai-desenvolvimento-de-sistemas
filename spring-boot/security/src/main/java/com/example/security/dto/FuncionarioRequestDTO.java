package com.example.security.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FuncionarioRequestDTO {

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, message = "O nome deve ter pelo menos 3 caracteres")
    @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres")
    private String nome;

    @NotBlank(message = "O email é obrigatório")
    @Email(message = "Deve ser um email válido")
    @Size(max = 100, message = "O email deve ter no máximo 100 caracteres")
    private String email;

    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 8, message = "A senha deve ter pelo menos 8 caracteres")
    @Size(max = 100, message = "A senha deve ter no máximo 100 caracteres")
    private String senha;
}
