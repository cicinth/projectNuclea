package org.example.service;

import org.example.model.Usuario;

public class UsuarioServico {
    EmailServico emailServico;

    public UsuarioServico(EmailServico emailServico) {
        this.emailServico = emailServico;
    }

    public void criarUsuario(String nome, String email, String senha){
        Usuario usuario = new Usuario(nome, email, senha);
        emailServico.enviarEmail(usuario.getEmail());
    }
}



