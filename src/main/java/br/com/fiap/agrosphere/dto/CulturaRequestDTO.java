package br.com.fiap.agrosphere.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CulturaRequestDTO(

        @NotBlank
        @Size(max = 100)
        String nomeCultura,

        String categoria,

        Integer tempoMaturacao,

        Double consumoHidrico,

        Integer resistenciaCalor,

        Integer resistenciaSeca

) {
}