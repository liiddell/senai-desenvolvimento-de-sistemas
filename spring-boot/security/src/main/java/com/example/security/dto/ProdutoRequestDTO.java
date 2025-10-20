package com.example.security.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProdutoRequestDTO {
    @NotBlank(message = "O nome do produto é obrigatório.")
    private String nome;

    @NotBlank(message = "O lote do produto é obrigatório.")
    @Size(max = 20, message = "O lote do produto deve ter no máximo 20 caracteres.")
    private String lote;

    @NotBlank(message = "A validade do produto é obrigatória.")
    private String validade;

    @NotBlank(message = "A categoria do produto é obrigatória.")
    @Size(max = 50, message = "A categoria do produto deve ter no máximo 50 caracteres.")
    private String categoria;

    @NotBlank(message = "A quantidade do produto é obrigatória.")
    private int quantidade;
}
