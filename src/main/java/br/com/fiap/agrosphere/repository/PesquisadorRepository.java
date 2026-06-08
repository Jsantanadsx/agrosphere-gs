package br.com.fiap.agrosphere.repository;

import br.com.fiap.agrosphere.entity.Pesquisador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PesquisadorRepository
        extends JpaRepository<Pesquisador, Long> {
}