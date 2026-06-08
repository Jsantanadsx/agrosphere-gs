package br.com.fiap.agrosphere.service;

import br.com.fiap.agrosphere.dto.LeituraSensorResponseDTO;
import br.com.fiap.agrosphere.entity.LeituraSensor;
import br.com.fiap.agrosphere.repository.LeituraSensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LeituraSensorService {

    private final LeituraSensorRepository repository;

    public List<LeituraSensorResponseDTO> listar() {

        return repository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .toList();
    }

    private LeituraSensorResponseDTO converterParaDTO(
            LeituraSensor leitura) {

        return new LeituraSensorResponseDTO(
                leitura.getId(),
                leitura.getSensor().getTipoSensor(),
                leitura.getValor(),
                leitura.getDataHora()
        );
    }
}