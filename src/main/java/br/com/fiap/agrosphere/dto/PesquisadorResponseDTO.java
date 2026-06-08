package br.com.fiap.agrosphere.dto;

import java.time.LocalDate;

public record PesquisadorResponseDTO(

        Long id,

        String nome,

        String email,

        String especialidade,

        String instituicao,

        LocalDate dataCadastro

) {
}