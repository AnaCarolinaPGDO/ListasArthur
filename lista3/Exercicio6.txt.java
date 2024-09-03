package com.poo.lista3;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar que o usuário insira o número de andares da pirâmide
            System.out.print("Digite o número de andares da pirâmide: ");
            int andares = scanner.nextInt();

            // Construir a pirâmide
            for (int i = 1; i <= andares; i++) {
                // Espaços à esquerda para centralizar os asteriscos
                for (int j = 0; j < andares - i; j++) {
                    System.out.print(" ");
                }

                // Asteriscos
                for (int k = 0; k < (2 * i - 1); k++) {
                    System.out.print("*");
                }

                // Nova linha após cada andar da pirâmide
                System.out.println();
            }
        }
    }
}
