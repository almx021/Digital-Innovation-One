package com.mendes.primeiros_passos.SistemaMensagemApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente finaceiro;

    public void enviarConfirmacaoMensagem() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado!");
        System.out.println("Telefones para contato: " + noreply.getTelefonesParaContatoFormatado());
    }

    public void enviarMensagemBoasVindas() {
        finaceiro.setEmail("teste.com.br");
        System.out.println(finaceiro);
        System.out.println("Bem-vindo!");
    }
    
}
