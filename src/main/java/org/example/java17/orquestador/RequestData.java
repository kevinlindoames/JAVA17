package org.example.java17.orquestador;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
public class RequestData {

    @NotNull
    private Long id;

    @NotBlank
    private String nombre;
}
