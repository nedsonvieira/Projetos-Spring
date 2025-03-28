package br.com.nedson.Controle_Orcamento.dto.usuario;

import jakarta.validation.constraints.NotBlank;

public record LoginDTO(

        @NotBlank(message = "O email é obrigatório!")
        String email,

        @NotBlank(message = "A senha é obrigatória!")
        String senha) {
}
