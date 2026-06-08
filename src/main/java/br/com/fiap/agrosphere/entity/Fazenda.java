package br.com.fiap.agrosphere.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "FAZENDA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Fazenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FAZENDA")
    private Long id;

    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;

    @Column(name = "PAIS", nullable = false, length = 80)
    private String pais;

    @Column(name = "REGIAO", length = 100)
    private String regiao;

    @Column(name = "TIPO_AMBIENTE", nullable = false, length = 30)
    private String tipoAmbiente;
}