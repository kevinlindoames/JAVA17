package org.example.java17.dominio;
import org.example.java17.dominio.modelo.Datos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DominioService {


        private final DominioRepository repository;

        @Autowired
        public DominioService(DominioRepository repository) {
            this.repository = repository;
        }

        public Datos guardarDatos(Datos datos) {
            // Lógica para guardar datos en la base de datos
            return repository.save(datos);
        }
}
