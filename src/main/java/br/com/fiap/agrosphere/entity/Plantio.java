package br.com.fiap.agrosphere.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "PLANTIO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Plantio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PLANTIO")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_FAZENDA")
    private Fazenda fazenda;

    @ManyToOne
    @JoinColumn(name = "ID_CULTURA")
    private Cultura cultura;

    @Column(name = "DATA_INICIO")
    private LocalDate dataInicio;

    @Column(name = "DATA_COLHEITA_PREVISTA")
    private LocalDate dataColheitaPrevista;

    @Column(name = "AREA_UTILIZADA")
    private Double areaUtilizada;

    @Column(name = "STATUS")
    private String status;
}