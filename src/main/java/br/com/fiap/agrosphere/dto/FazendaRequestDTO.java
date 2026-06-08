package br.com.fiap.agrosphere.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record FazendaRequestDTO(

        @NotBlank
        @Size(max = 100)
        String nome,

        @NotBlank
        @Size(max = 80)
        String pais,

        String regiao,

        @NotBlank
        String tipoAmbiente

) {
}