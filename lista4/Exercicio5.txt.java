package com.poo.lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Cria uma lista para armazenar os itens de compras
        ArrayList<String> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu de opções
            System.out.println("\n--- Lista de Compras ---");
            System.out.println("1. Inserir item");
            System.out.println("2. Ver lista de compras");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    // Insere um item na lista de compras
                    System.out.print("Digite o nome do item: ");
                    String item = scanner.nextLine();
                    listaDeCompras.add(item);
                    System.out.println("Item \"" + item + "\" adicionado à lista.");
                    break;

                case 2:
                    // Exibe os itens da lista de compras
                    System.out.println("\n--- Sua Lista de Compras ---");
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                        }
                    }
                    break;

                case 3:
                    // Encerra o programa
                    System.out.println("Saindo... Obrigado por usar a lista de compras!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}

