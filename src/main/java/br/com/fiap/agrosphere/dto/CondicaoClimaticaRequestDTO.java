package br.com.fiap.agrosphere.dto;

import java.time.LocalDate;

public record CondicaoClimaticaRequestDTO(

        Long fazendaId,

        Double temperaturaMedia,

        Double umidade,

        Double indiceRadiacao,

        Double indiceSeca,

        Double velocidadeVento,

        LocalDate dataColeta

) {
}