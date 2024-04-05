package org.example.java17.dominio;

import org.example.java17.dominio.modelo.Datos;
import org.example.java17.dominio.DatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
public class DominioController {
    @Autowired
    private DatosRepository datosRepository;

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarDatos(@RequestBody Datos datos) {
        try {
            datosRepository.save(datos);
            return ResponseEntity.ok("Datos guardados correctamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al guardar los datos");
        }
    }
}
