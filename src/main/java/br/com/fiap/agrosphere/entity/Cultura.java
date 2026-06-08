package br.com.fiap.agrosphere.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "CULTURA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cultura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CULTURA")
    private Long id;

    @Column(name = "NOME_CULTURA", nullable = false, length = 100)
    private String nomeCultura;

    @Column(name = "CATEGORIA", length = 50)
    private String categoria;

    @Column(name = "TEMPO_MATURACAO")
    private Integer tempoMaturacao;

    @Column(name = "CONSUMO_HIDRICO")
    private Double consumoHidrico;

    @Column(name = "RESISTENCIA_CALOR")
    private Integer resistenciaCalor;

    @Column(name = "RESISTENCIA_SECA")
    private Integer resistenciaSeca;
}