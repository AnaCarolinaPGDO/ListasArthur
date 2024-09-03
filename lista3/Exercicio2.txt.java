package com.poo.lista3;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar que o usuário insira um número
            System.out.print("Digite um número para ver a tabuada: ");
            int numero = scanner.nextInt();

            // Exibir a tabuada do número
            System.out.println("Tabuada de " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}
