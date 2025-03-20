package com.ilyas.dessar.backend;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class BackendApplication {

    Public static void main (String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }
}
