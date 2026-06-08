package br.com.fiap.agrosphere.service;

import br.com.fiap.agrosphere.dto.FazendaRequestDTO;
import br.com.fiap.agrosphere.dto.FazendaResponseDTO;
import br.com.fiap.agrosphere.entity.Fazenda;
import br.com.fiap.agrosphere.exception.ResourceNotFoundException;
import br.com.fiap.agrosphere.repository.FazendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FazendaService {

    private final FazendaRepository repository;

    public List<FazendaResponseDTO> listar() {

        return repository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .toList();
    }

    public FazendaResponseDTO buscarPorId(Long id) {

        Fazenda fazenda = repository.findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException(
                                "Fazenda não encontrada"
                        )
                );

        return converterParaDTO(fazenda);
    }

    public FazendaResponseDTO cadastrar(
            FazendaRequestDTO dto) {

        Fazenda fazenda = Fazenda.builder()
                .nome(dto.nome())
                .pais(dto.pais())
                .regiao(dto.regiao())
                .tipoAmbiente(dto.tipoAmbiente())
                .build();

        return converterParaDTO(
                repository.save(fazenda)
        );
    }

    public FazendaResponseDTO atualizar(
            Long id,
            FazendaRequestDTO dto) {

        Fazenda fazenda = repository.findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException(
                                "Fazenda não encontrada"
                        )
                );

        fazenda.setNome(dto.nome());
        fazenda.setPais(dto.pais());
        fazenda.setRegiao(dto.regiao());
        fazenda.setTipoAmbiente(dto.tipoAmbiente());

        return converterParaDTO(
                repository.save(fazenda)
        );
    }

    public void excluir(Long id) {

        Fazenda fazenda = repository.findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException(
                                "Fazenda não encontrada"
                        )
                );

        repository.delete(fazenda);
    }

    private FazendaResponseDTO converterParaDTO(
            Fazenda fazenda) {

        return new FazendaResponseDTO(
                fazenda.getId(),
                fazenda.getNome(),
                fazenda.getPais(),
                fazenda.getRegiao(),
                fazenda.getTipoAmbiente()
        );
    }
}
