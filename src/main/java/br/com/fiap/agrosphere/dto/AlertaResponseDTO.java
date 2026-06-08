package br.com.fiap.agrosphere.dto;

import java.time.LocalDate;

public record AlertaResponseDTO(

        Long id,

        String fazenda,

        String tipoAlerta,

        Integer severidade,

        String descricao,

        LocalDate dataAlerta

) {
}