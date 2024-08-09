package com.mendes.spring_security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Bem-vindo!";
    }

    @GetMapping("/users")
    public String users() {
        return "Usuário autorizado.";
    }

    @GetMapping("/admin")
    public String admins() {
        return "Olá, adm.";
    }
}
