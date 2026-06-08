package br.com.fiap.agrosphere.repository;

import br.com.fiap.agrosphere.entity.LeituraSensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeituraSensorRepository
        extends JpaRepository<LeituraSensor, Long> {
}