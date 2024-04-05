package org.example.java17;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.example.java17.orquestador.OrquestadorController;
import org.example.java17.orquestador.RequestData;
import org.example.java17.orquestador.ServicioOrquestador;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class OrquestadorControllerTest {

    @Test
    public void testProcesarRequest() {
        // Mock del servicio de Orquestador
        ServicioOrquestador servicioMock = mock(ServicioOrquestador.class);
        when(servicioMock.procesarRequest(any())).thenReturn("Respuesta del servicio");

        // Crear el controlador con el servicio mock
        OrquestadorController controller = new OrquestadorController(servicioMock);

        // Ejecutar el método bajo prueba
        ResponseEntity<String> response = controller.procesarRequest(new RequestData());

        // Verificar el resultado
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Respuesta del servicio", response.getBody());
    }
}
