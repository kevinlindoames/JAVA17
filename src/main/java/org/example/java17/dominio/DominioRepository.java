package org.example.java17.dominio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.java17.dominio.modelo.Datos;
public interface DominioRepository extends JpaRepository <Datos, Long> {

}
