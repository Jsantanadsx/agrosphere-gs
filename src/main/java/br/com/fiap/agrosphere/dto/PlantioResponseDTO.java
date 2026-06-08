package br.com.fiap.agrosphere.dto;

import java.time.LocalDate;

public record PlantioResponseDTO(

        Long id,

        String fazenda,

        String cultura,

        LocalDate dataInicio,

        LocalDate dataColheitaPrevista,

        Double areaUtilizada,

        String status

) {
}