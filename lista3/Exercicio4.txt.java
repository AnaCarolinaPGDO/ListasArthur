package com.poo.lista3;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar que a primeira pessoa escolha um número
            System.out.print("Jogador 1, escolha um número (0 a 100): ");
            int numeroEscolhido = scanner.nextInt();

            // Limpar a tela (opcional) para esconder o número escolhido da segunda pessoa
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }

            // Solicitar que a segunda pessoa tente adivinhar o número
            System.out.println("Jogador 2, tente adivinhar o número!");

            int tentativa;
            int diferenca;

            while (true) {
                System.out.print("Digite seu palpite: ");
                tentativa = scanner.nextInt();

                diferenca = Math.abs(numeroEscolhido - tentativa);

                if (tentativa == numeroEscolhido) {
                    System.out.println("Parabéns! Você acertou o número.");
                    break;
                } else if (diferenca >= 50) {
                    System.out.println("Tá muito frio!");
                } else if (diferenca >= 30) {
                    System.out.println("Tá frio.");
                } else if (diferenca >= 10) {
                    System.out.println("Tá quente!");
                } else if (diferenca >= 5) {
                    System.out.println("Quase lá!");
                } else {
                    System.out.println("Tá muito quente!");
                }

                if (tentativa < numeroEscolhido) {
                    System.out.println("Muito baixo.");
                } else {
                    System.out.println("Muito alto.");
                }
            }
        }
    }
}
