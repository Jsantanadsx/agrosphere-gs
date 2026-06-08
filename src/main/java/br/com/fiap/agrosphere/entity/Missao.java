package br.com.fiap.agrosphere.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "MISSAO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Missao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MISSAO")
    private Long id;

    @Column(name = "NOME_MISSAO")
    private String nomeMissao;

    @Column(name = "OBJETIVO")
    private String objetivo;

    @Column(name = "TIPO_MISSAO")
    private String tipoMissao;

    @Column(name = "DATA_INICIO")
    private LocalDate dataInicio;

    @Column(name = "STATUS")
    private String status;
}