package br.com.fiap.agrosphere.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record SensorRequestDTO(

        @NotNull
        Long fazendaId,

        @NotBlank
        String tipoSensor,

        String fabricante,

        String status,

        LocalDate dataInstalacao

) {
}