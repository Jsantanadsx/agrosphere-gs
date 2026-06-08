package br.com.fiap.agrosphere.dto;

import java.time.LocalDate;

public record CondicaoClimaticaResponseDTO(

        Long id,

        String fazenda,

        Double temperaturaMedia,

        Double umidade,

        Double indiceRadiacao,

        Double indiceSeca,

        Double velocidadeVento,

        LocalDate dataColeta

) {
}