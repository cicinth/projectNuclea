package org.example.service;

public class EmailServico {

    private String remetente;

    public EmailServico(String remetente) {
        this.remetente = remetente;
    }

    public void enviarEmail(String email){
        //TODO fazer codido de enviar email
        System.out.println("Enviando email de "+ remetente +
                "Para: "+ email);
    }
}
