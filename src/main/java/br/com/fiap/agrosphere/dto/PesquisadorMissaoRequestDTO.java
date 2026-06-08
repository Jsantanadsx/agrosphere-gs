package br.com.fiap.agrosphere.dto;

public record PesquisadorMissaoRequestDTO(

        Long pesquisadorId,

        Long missaoId,

        String papel

) {
}