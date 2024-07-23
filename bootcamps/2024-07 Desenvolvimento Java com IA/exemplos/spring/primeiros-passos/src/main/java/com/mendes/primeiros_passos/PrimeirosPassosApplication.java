package com.mendes.primeiros_passos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//import com.mendes.primeiros_passos.CepApp.ConversorJson;
//import com.mendes.primeiros_passos.CepApp.ViaCepResponse;
import com.mendes.primeiros_passos.SistemaMensagemApp.SistemaMensagem;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}

	/*
	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"01001-00\", \"logradouro\": \"Praça da Sé\", \"localidade\": \"São Paulo\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP: " + response);
		};
	} */

	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
		return args -> {
			sistema.enviarConfirmacaoMensagem();
			sistema.enviarMensagemBoasVindas();
			sistema.enviarConfirmacaoMensagem();
		};	
	}	

}
