package br.com.fiap.agrosphere.controller;

import br.com.fiap.agrosphere.dto.MissaoResponseDTO;
import br.com.fiap.agrosphere.service.MissaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
@RequiredArgsConstructor
public class MissaoController {

    private final MissaoService service;

    @GetMapping
    public List<MissaoResponseDTO> listar() {
        return service.listar();
    }
}