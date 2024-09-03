package com.poo.lista3;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Credenciais corretas (podem ser alteradas conforme necessário)
            final String LOGIN_CORRETO = "Aninha3";
            final String SENHA_CORRETA = "senha456";

            // Variáveis para controlar as tentativas
            int tentativas = 0;
            final int MAX_TENTATIVAS = 3;

            while (tentativas < MAX_TENTATIVAS) {
                System.out.print("Digite seu login: ");
                String login = scanner.nextLine();

                System.out.print("Digite sua senha: ");
                String senha = scanner.nextLine();

                if (login.equals(LOGIN_CORRETO) && senha.equals(SENHA_CORRETA)) {
                    System.out.println("Acesso concedido!");
                    break;
                } else {
                    tentativas++;
                    if (!login.equals(LOGIN_CORRETO)) {
                        System.out.println("Erro: Login incorreto.");
                    }
                    if (!senha.equals(SENHA_CORRETA)) {
                        System.out.println("Erro: Senha incorreta.");
                    }

                    if (tentativas == MAX_TENTATIVAS - 1) {
                        System.out.println("Última tentativa, mais um erro seu acesso será bloqueado!");
                    } else if (tentativas >= MAX_TENTATIVAS) {
                        System.out.println("Acesso bloqueado. Número máximo de tentativas excedido.");
                    }
                }
            }
        }
    }
}

