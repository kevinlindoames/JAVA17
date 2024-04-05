package org.example.java17;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.example.java17.dominio.DominioRepository;
import org.example.java17.dominio.DominioService;
import org.example.java17.dominio.modelo.Datos;
import org.junit.jupiter.api.Test;

public class DominioServiceTest {
    @Test
    public void testGuardarDatos() {
        // Mock del repositorio de Dominio
        DominioRepository repositoryMock = mock(DominioRepository.class);
        when(repositoryMock.save(any())).thenReturn(new Datos());

        // Crear el servicio con el repositorio mock
        DominioService service = new DominioService(repositoryMock);

        // Ejecutar el método bajo prueba
        Datos datos = service.guardarDatos(new Datos());

        // Verificar el resultado
        assertNotNull(datos);
    }
}
