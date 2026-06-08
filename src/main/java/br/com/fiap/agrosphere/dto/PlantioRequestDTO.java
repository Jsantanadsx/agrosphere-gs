package br.com.fiap.agrosphere.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record PlantioRequestDTO(

        @NotNull
        Long fazendaId,

        @NotNull
        Long culturaId,

        LocalDate dataInicio,

        LocalDate dataColheitaPrevista,

        Double areaUtilizada,

        String status

) {
}