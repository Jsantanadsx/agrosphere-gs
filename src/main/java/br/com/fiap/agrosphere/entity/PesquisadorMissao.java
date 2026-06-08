package br.com.fiap.agrosphere.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "PESQUISADOR_MISSAO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PesquisadorMissao {

    @EmbeddedId
    private PesquisadorMissaoId id;

    @ManyToOne
    @MapsId("idPesquisador")
    @JoinColumn(name = "ID_PESQUISADOR")
    private Pesquisador pesquisador;

    @ManyToOne
    @MapsId("idMissao")
    @JoinColumn(name = "ID_MISSAO")
    private Missao missao;

    @Column(name = "PAPEL")
    private String papel;

    @Column(name = "DATA_ENTRADA")
    private LocalDate dataEntrada;
}