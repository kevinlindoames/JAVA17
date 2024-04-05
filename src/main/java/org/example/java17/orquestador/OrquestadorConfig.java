package org.example.java17.orquestador;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class OrquestadorConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
