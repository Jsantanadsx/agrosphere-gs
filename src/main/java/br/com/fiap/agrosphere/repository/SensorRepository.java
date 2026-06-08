package br.com.fiap.agrosphere.repository;

import br.com.fiap.agrosphere.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository
        extends JpaRepository<Sensor, Long> {
}