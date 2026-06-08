package br.com.fiap.agrosphere.service;

import br.com.fiap.agrosphere.dto.AlertaResponseDTO;
import br.com.fiap.agrosphere.entity.Alerta;
import br.com.fiap.agrosphere.repository.AlertaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlertaService {

    private final AlertaRepository repository;

    public List<AlertaResponseDTO> listar() {

        return repository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .toList();
    }

    private AlertaResponseDTO converterParaDTO(
            Alerta alerta) {

        return new AlertaResponseDTO(
                alerta.getId(),
                alerta.getFazenda().getNome(),
                alerta.getTipoAlerta(),
                alerta.getSeveridade(),
                alerta.getDescricao(),
                alerta.getDataAlerta()
        );
    }
}