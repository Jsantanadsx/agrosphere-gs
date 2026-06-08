package br.com.fiap.agrosphere.dto;

public record PesquisadorRequestDTO(

        String nome,

        String email,

        String especialidade,

        String instituicao

) {
}