package br.com.fiap.agrosphere.controller;

import br.com.fiap.agrosphere.dto.PesquisadorMissaoResponseDTO;
import br.com.fiap.agrosphere.service.PesquisadorMissaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pesquisadores-missoes")
@RequiredArgsConstructor
public class PesquisadorMissaoController {

    private final PesquisadorMissaoService service;

    @GetMapping
    public List<PesquisadorMissaoResponseDTO> listar() {
        return service.listar();
    }
}