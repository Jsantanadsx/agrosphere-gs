package br.com.fiap.agrosphere.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "EXPERIMENTO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Experimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EXPERIMENTO")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_MISSAO")
    private Missao missao;

    @ManyToOne
    @JoinColumn(name = "ID_PLANTIO")
    private Plantio plantio;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "RESULTADO")
    private String resultado;

    @Column(name = "NIVEL_SUCESSO")
    private Double nivelSucesso;
}