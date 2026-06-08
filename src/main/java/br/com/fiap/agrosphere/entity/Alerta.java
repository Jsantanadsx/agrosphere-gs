package br.com.fiap.agrosphere.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "ALERTA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ALERTA")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_FAZENDA")
    private Fazenda fazenda;

    @Column(name = "TIPO_ALERTA")
    private String tipoAlerta;

    @Column(name = "SEVERIDADE")
    private Integer severidade;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "DATA_ALERTA")
    private LocalDate dataAlerta;
}