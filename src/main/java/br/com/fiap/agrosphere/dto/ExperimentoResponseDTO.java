package br.com.fiap.agrosphere.dto;

public record ExperimentoResponseDTO(

        Long id,

        String missao,

        String cultura,

        String descricao,

        String resultado,

        Double nivelSucesso

) {
}