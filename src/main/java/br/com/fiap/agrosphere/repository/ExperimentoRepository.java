package br.com.fiap.agrosphere.repository;

import br.com.fiap.agrosphere.entity.Experimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperimentoRepository
        extends JpaRepository<Experimento, Long> {
}