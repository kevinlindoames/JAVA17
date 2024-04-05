package org.example.java17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"org.example.java17.dominio.modelo"})
public class Java17Application {

    public static void main(String[] args) {
        SpringApplication.run(Java17Application.class, args);
    }

}
