package com.poo.lista4;

public class Exercicio4 {
    public static void main(String[] args) {
        // Lista de números inteiros
        int[] lista = {3, 5, 6, 7, 8, 10, 22, 55, 110};

        // Variável para contar a quantidade de números pares
        int quantidadePares = 0;

        // Loop para percorrer a lista e contar os números pares
        for (int numero : lista) {
            if (numero % 2 == 0) {  // Verifica se o número é par
                quantidadePares++;
            }
        }

        // Exibe a quantidade de números pares na lista
        System.out.println("Quantidade de números pares na lista: " + quantidadePares);
    }
}

