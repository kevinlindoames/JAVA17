package org.example.java17.orquestador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Validated
public class OrquestadorController {

    private final ServicioOrquestador servicioOrquestador;

    @Autowired
    public OrquestadorController(ServicioOrquestador servicioOrquestador) {
        this.servicioOrquestador = servicioOrquestador;
    }

    @PostMapping("/enviar")
    public ResponseEntity<String> procesarRequest(@RequestBody RequestData requestData) {
        String respuestaServicio = servicioOrquestador.procesarRequest(requestData);
        return ResponseEntity.ok(respuestaServicio);
    }
}

