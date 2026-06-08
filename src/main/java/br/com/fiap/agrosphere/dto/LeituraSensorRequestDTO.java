package br.com.fiap.agrosphere.dto;

import java.time.LocalDateTime;

public record LeituraSensorRequestDTO(

        Long sensorId,

        Double valor,

        LocalDateTime dataHora

) {
}