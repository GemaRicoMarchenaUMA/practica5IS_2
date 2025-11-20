package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class saludoController {

    @GetMapping("/hola")
    public String saludo() {
        return "¡Hola Mundo! Funciona correctamente en el Grupo G";
    }
}
