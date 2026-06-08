package br.com.fiap.agrosphere.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "LEITURA_SENSOR")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeituraSensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LEITURA")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_SENSOR")
    private Sensor sensor;

    @Column(name = "VALOR")
    private Double valor;

    @Column(name = "DATA_HORA")
    private LocalDateTime dataHora;
}