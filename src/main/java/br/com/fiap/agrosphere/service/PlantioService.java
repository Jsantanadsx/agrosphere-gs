package br.com.fiap.agrosphere.service;

import br.com.fiap.agrosphere.dto.PlantioResponseDTO;
import br.com.fiap.agrosphere.entity.Plantio;
import br.com.fiap.agrosphere.repository.PlantioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlantioService {

    private final PlantioRepository repository;

    public List<PlantioResponseDTO> listar() {

        return repository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .toList();
    }

    private PlantioResponseDTO converterParaDTO(
            Plantio plantio) {

        return new PlantioResponseDTO(
                plantio.getId(),
                plantio.getFazenda().getNome(),
                plantio.getCultura().getNomeCultura(),
                plantio.getDataInicio(),
                plantio.getDataColheitaPrevista(),
                plantio.getAreaUtilizada(),
                plantio.getStatus()
        );
    }
}