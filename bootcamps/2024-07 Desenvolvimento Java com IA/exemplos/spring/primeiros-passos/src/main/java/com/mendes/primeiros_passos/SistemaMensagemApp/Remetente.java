package com.mendes.primeiros_passos.SistemaMensagemApp;

import java.util.List;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "remetente")
public class Remetente {
    private String nome;
    private String email;
    private List<Long> telefonesParaContato;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getTelefonesParaContato() {
        return telefonesParaContato;
    }

    public void setTelefonesParaContato(List<Long> telefonesParaContato) {
        this.telefonesParaContato = telefonesParaContato;
    }

    @Override
    public String toString() {
        return "Remetente{nome=" + nome + ", email=" + email + "}";
    }

    public List<String> getTelefonesParaContatoFormatado() {
        return telefonesParaContato.stream().map(numero -> String.valueOf(numero).replaceFirst("(\\d{2})", "($1)")).toList();
    }

}
