package br.com.fiap.agrosphere.dto;

import java.time.LocalDate;

public record MissaoRequestDTO(

        String nomeMissao,

        String objetivo,

        String tipoMissao,

        LocalDate dataInicio,

        String status

) {
}