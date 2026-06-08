package br.com.fiap.agrosphere.dto;

public record CulturaResponseDTO(

        Long id,

        String nomeCultura,

        String categoria,

        Integer tempoMaturacao,

        Double consumoHidrico,

        Integer resistenciaCalor,

        Integer resistenciaSeca

) {
}