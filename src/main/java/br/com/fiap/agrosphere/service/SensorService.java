package br.com.fiap.agrosphere.service;

import br.com.fiap.agrosphere.dto.SensorResponseDTO;
import br.com.fiap.agrosphere.entity.Sensor;
import br.com.fiap.agrosphere.repository.SensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SensorService {

    private final SensorRepository repository;

    public List<SensorResponseDTO> listar() {

        return repository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .toList();
    }

    private SensorResponseDTO converterParaDTO(
            Sensor sensor) {

        return new SensorResponseDTO(
                sensor.getId(),
                sensor.getFazenda().getNome(),
                sensor.getTipoSensor(),
                sensor.getFabricante(),
                sensor.getStatus(),
                sensor.getDataInstalacao()
        );
    }
}