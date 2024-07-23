package com.mendes.primeiros_passos.SistemaMensagemApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Remetente remetente() {
        System.out.println("CRIANDO REMETENTE");
        Remetente remetente = new Remetente();
        return remetente;
    }
}
