package br.com.fiap.agrosphere.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PesquisadorMissaoId
        implements Serializable {

    private Long idPesquisador;

    private Long idMissao;
}