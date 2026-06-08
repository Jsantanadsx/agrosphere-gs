package br.com.fiap.agrosphere.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(
            ResourceNotFoundException.class
    )
    public ResponseEntity<Map<String, Object>>
    tratarRecursoNaoEncontrado(
            ResourceNotFoundException ex) {

        Map<String, Object> erro = new HashMap<>();

        erro.put(
                "timestamp",
                LocalDateTime.now()
        );

        erro.put(
                "status",
                HttpStatus.NOT_FOUND.value()
        );

        erro.put(
                "erro",
                ex.getMessage()
        );

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(erro);
    }

    @ExceptionHandler(
            MethodArgumentNotValidException.class
    )
    public ResponseEntity<Map<String, Object>>
    tratarValidacao(
            MethodArgumentNotValidException ex) {

        Map<String, Object> erro = new HashMap<>();

        erro.put(
                "timestamp",
                LocalDateTime.now()
        );

        erro.put(
                "status",
                HttpStatus.BAD_REQUEST.value()
        );

        erro.put(
                "erro",
                "Dados inválidos"
        );

        return ResponseEntity
                .badRequest()
                .body(erro);
    }
}