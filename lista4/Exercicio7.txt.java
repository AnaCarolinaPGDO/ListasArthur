package com.poo.lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        // Cria listas para armazenar os itens de compras e seus respectivos preços
        ArrayList<String> listaDeCompras = new ArrayList<>();
        ArrayList<Double> listaDePrecos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu de opções
            System.out.println("\n--- Lista de Compras ---");
            System.out.println("1. Inserir item");
            System.out.println("2. Ver lista de compras");
            System.out.println("3. Remover item");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    // Insere um item e seu preço na lista de compras
                    System.out.print("Digite o nome do item: ");
                    String item = scanner.nextLine();
                    System.out.print("Digite o preço do item: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a nova linha

                    listaDeCompras.add(item);
                    listaDePrecos.add(preco);

                    System.out.println("Item \"" + item + "\" com preço R$ " + preco + " adicionado à lista.");
                    break;

                case 2:
                    // Exibe os itens da lista de compras e seus respectivos preços
                    System.out.println("\n--- Sua Lista de Compras ---");
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeCompras.get(i) + " - R$ " + listaDePrecos.get(i));
                        }
                    }
                    break;

                case 3:
                    // Remove um item da lista de compras e seu respectivo preço
                    System.out.println("\n--- Remover Item ---");
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista está vazia. Não há itens para remover.");
                    } else {
                        System.out.println("Escolha o número do item que deseja remover:");
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeCompras.get(i) + " - R$ " + listaDePrecos.get(i));
                        }
                        int indiceRemover = scanner.nextInt();
                        scanner.nextLine(); // Consumir a nova linha

                        if (indiceRemover > 0 && indiceRemover <= listaDeCompras.size()) {
                            String itemRemovido = listaDeCompras.remove(indiceRemover - 1);
                            double precoRemovido = listaDePrecos.remove(indiceRemover - 1);
                            System.out.println("Item \"" + itemRemovido + "\" com preço R$ " + precoRemovido + " removido da lista.");
                        } else {
                            System.out.println("Número inválido! Tente novamente.");
                        }
                    }
                    break;

                case 4:
                    // Encerra o programa
                    System.out.println("Saindo... Obrigado por usar a lista de compras!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
