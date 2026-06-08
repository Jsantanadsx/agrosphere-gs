package br.com.fiap.agrosphere.dto;

public record FazendaResponseDTO(

        Long id,
        String nome,
        String pais,
        String regiao,
        String tipoAmbiente

) {
}