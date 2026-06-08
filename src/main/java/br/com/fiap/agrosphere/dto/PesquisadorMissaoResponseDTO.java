package br.com.fiap.agrosphere.dto;

import java.time.LocalDate;

public record PesquisadorMissaoResponseDTO(

        String pesquisador,

        String missao,

        String papel,

        LocalDate dataEntrada

) {
}