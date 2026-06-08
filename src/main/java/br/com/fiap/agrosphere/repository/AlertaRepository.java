package br.com.fiap.agrosphere.repository;

import br.com.fiap.agrosphere.entity.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertaRepository
        extends JpaRepository<Alerta, Long> {
}