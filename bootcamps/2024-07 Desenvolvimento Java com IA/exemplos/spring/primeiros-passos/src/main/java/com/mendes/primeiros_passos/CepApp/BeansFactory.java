package com.mendes.primeiros_passos.CepApp;

import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

public class BeansFactory {
    @Bean
    public Gson gson() {
        return new Gson();
    }
}