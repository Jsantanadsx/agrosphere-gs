package br.com.fiap.agrosphere.controller;

import br.com.fiap.agrosphere.dto.CulturaResponseDTO;
import br.com.fiap.agrosphere.service.CulturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/culturas")
@RequiredArgsConstructor
public class CulturaController {

    private final CulturaService service;

    @GetMapping
    public List<CulturaResponseDTO> listar() {
        return service.listar();
    }
}