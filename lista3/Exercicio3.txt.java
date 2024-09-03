package com.poo.lista3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar que o usuário insira os dois números inteiros
            System.out.print("Digite o primeiro número inteiro: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int num2 = scanner.nextInt();

            // Determinar o menor e o maior número para o loop
            int inicio = Math.min(num1, num2);
            int fim = Math.max(num1, num2);

            // Exibir os números pares entre os dois números
            System.out.println("Números pares entre " + inicio + " e " + fim + ":");
            for (int i = inicio; i <= fim; i++) {
                if (i % 2 == 0) { // Verifica se o número é par
                    System.out.println(i);
                }
            }
        }
    }
}
