package br.com.fiap.agrosphere.repository;

import br.com.fiap.agrosphere.entity.CondicaoClimatica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CondicaoClimaticaRepository
        extends JpaRepository<CondicaoClimatica, Long> {
}