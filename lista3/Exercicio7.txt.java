package com.poo.lista3;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar que o usuário insira a largura e a altura do retângulo
            System.out.print("Digite a largura do retângulo: ");
            int largura = scanner.nextInt();

            System.out.print("Digite a altura do retângulo: ");
            int altura = scanner.nextInt();

            // Construir o retângulo
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < largura; j++) {
                    System.out.print("*");
                }
                // Nova linha após cada linha do retângulo
                System.out.println();
            }
        }
    }
}
