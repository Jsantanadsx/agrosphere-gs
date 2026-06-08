package br.com.fiap.agrosphere.controller;

import br.com.fiap.agrosphere.dto.PlantioResponseDTO;
import br.com.fiap.agrosphere.service.PlantioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plantios")
@RequiredArgsConstructor
public class PlantioController {

    private final PlantioService service;

    @GetMapping
    public List<PlantioResponseDTO> listar() {
        return service.listar();
    }
}