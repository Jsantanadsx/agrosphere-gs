package br.com.fiap.agrosphere.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "SENSOR")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SENSOR")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_FAZENDA")
    private Fazenda fazenda;

    @Column(name = "TIPO_SENSOR")
    private String tipoSensor;

    @Column(name = "FABRICANTE")
    private String fabricante;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DATA_INSTALACAO")
    private LocalDate dataInstalacao;
}