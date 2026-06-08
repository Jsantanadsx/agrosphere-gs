package br.com.fiap.agrosphere.dto;

public record ExperimentoRequestDTO(

        Long missaoId,

        Long plantioId,

        String descricao,

        String resultado,

        Double nivelSucesso

) {
}