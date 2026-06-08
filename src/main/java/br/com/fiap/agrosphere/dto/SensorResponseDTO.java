package br.com.fiap.agrosphere.dto;

import java.time.LocalDate;

public record SensorResponseDTO(

        Long id,

        String fazenda,

        String tipoSensor,

        String fabricante,

        String status,

        LocalDate dataInstalacao

) {
}