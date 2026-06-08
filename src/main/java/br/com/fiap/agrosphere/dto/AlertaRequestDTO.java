package br.com.fiap.agrosphere.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AlertaRequestDTO(

        @NotNull
        Long fazendaId,

        @NotBlank
        String tipoAlerta,

        @NotNull
        Integer severidade,

        String descricao

) {
}