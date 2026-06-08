package br.com.fiap.agrosphere.dto;

import java.time.LocalDateTime;

public record LeituraSensorResponseDTO(

        Long id,

        String tipoSensor,

        Double valor,

        LocalDateTime dataHora

) {
}