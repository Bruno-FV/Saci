package com.saci.imobiliario.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CadastroAlugueCompralDto(
                                    @NotNull byte[] imagem,
                                    @NotBlank @NotNull String descricao,
                                    @NotNull double valor,
                                    @NotBlank @NotNull String contato) {     
}
