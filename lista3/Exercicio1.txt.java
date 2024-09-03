package com.poo.lista3;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int segundos = 0;

            // Solicitar que o usuário insira um número de segundos válido
            while (true) {
                System.out.print("Digite um número de segundos (entre 1 e 59): ");
                if (scanner.hasNextInt()) {
                    segundos = scanner.nextInt();
                    if (segundos >= 1 && segundos <= 59) {
                        break;
                    } else {
                        System.out.println("Erro: Por favor, digite um número entre 1 e 59.");
                    }
                } else {
                    System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                    scanner.next(); // Limpar a entrada inválida
                }
            }

            // Contagem regressiva
            for (int i = segundos; i > 0; i--) {
                System.out.println("Cronômetro: " + i + " segundos restantes");
                try {
                    Thread.sleep(1000); // Pausar por 1 segundo
                } catch (InterruptedException e) {
                    System.out.println("O cronômetro foi interrompido.");
                }
            }
        }
        System.out.println("Tempo esgotado!");
    }
}
