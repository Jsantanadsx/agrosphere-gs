package br.com.fiap.agrosphere.controller;

import br.com.fiap.agrosphere.dto.FazendaRequestDTO;
import br.com.fiap.agrosphere.dto.FazendaResponseDTO;
import br.com.fiap.agrosphere.service.FazendaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fazendas")
@RequiredArgsConstructor
public class FazendaController {

    private final FazendaService service;

    @GetMapping
    public List<FazendaResponseDTO> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public FazendaResponseDTO buscarPorId(
            @PathVariable Long id) {

        return service.buscarPorId(id);
    }

    @PostMapping
    public FazendaResponseDTO cadastrar(
            @RequestBody
            @Valid
            FazendaRequestDTO dto) {

        return service.cadastrar(dto);
    }

    @PutMapping("/{id}")
    public FazendaResponseDTO atualizar(
            @PathVariable Long id,
            @RequestBody
            @Valid
            FazendaRequestDTO dto) {

        return service.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void excluir(
            @PathVariable Long id) {

        service.excluir(id);
    }
}