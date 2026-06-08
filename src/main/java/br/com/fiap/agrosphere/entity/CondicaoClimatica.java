package br.com.fiap.agrosphere.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "CONDICAO_CLIMATICA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CondicaoClimatica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONDICAO")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_FAZENDA")
    private Fazenda fazenda;

    @Column(name = "TEMPERATURA_MEDIA")
    private Double temperaturaMedia;

    @Column(name = "UMIDADE")
    private Double umidade;

    @Column(name = "INDICE_RADIACAO")
    private Double indiceRadiacao;

    @Column(name = "INDICE_SECA")
    private Double indiceSeca;

    @Column(name = "VELOCIDADE_VENTO")
    private Double velocidadeVento;

    @Column(name = "DATA_COLETA")
    private LocalDate dataColeta;
}