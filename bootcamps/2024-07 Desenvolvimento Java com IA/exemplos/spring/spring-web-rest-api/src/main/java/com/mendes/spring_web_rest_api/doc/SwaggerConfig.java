package com.mendes.spring_web_rest_api.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
    private Contact Contact() {
        Contact c = new Contact();
        c.setName("André Lucas");
        c.setEmail("alm021@hotmail.com");
        c.setUrl("https://github.com/almx021/");
        return c;

    }

    @Bean
    public OpenAPI SpringOpenAPI() {
    return new OpenAPI()
            .info(new Info().title("Spring Rest API")
            .description("API exemplo de uso de Springboot REST API")
            .version("v1.0")
            .license(new License().name("Apache 2.0").url("http://localhost:8080")).
            contact(Contact()));
    }
    
}
