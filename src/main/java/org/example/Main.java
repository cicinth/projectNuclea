package org.example;

import org.example.service.EmailServico;
import org.example.service.UsuarioServico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EmailServico emailServico = new EmailServico("nucela@teste.com");
        UsuarioServico usuarioServico = new UsuarioServico(emailServico);

        System.out.println("Digite o nome do usuario:");
        String nome = scanner.nextLine();

        System.out.println("Digite o email do usuario");
        String email = scanner.nextLine();

        System.out.println("Digite a senha do usuario");
        String senha = scanner.nextLine();

        usuarioServico.criarUsuario(nome, email, senha);
    }
}

