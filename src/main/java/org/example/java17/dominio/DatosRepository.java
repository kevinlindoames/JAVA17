package org.example.java17.dominio;
import org.example.java17.dominio.modelo.Datos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatosRepository extends JpaRepository <Datos,Long> {
}
