package br.com.fiap.agrosphere.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "PESQUISADOR")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pesquisador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PESQUISADOR")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ESPECIALIDADE")
    private String especialidade;

    @Column(name = "INSTITUICAO")
    private String instituicao;

    @Column(name = "DATA_CADASTRO")
    private LocalDate dataCadastro;
}