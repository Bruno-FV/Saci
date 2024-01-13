package com.saci.imobiliario.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record SaciCadastroCorretorDto(@NotBlank @NotNull String nomeCorretor, @NotBlank @NotNull String emailCorretor,
                                    @NotBlank @NotNull String senhaCorretor,@NotBlank @NotNull String contatoCorretor) {
    
}
