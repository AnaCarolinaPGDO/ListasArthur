package com.poo.lista4;

public class Exercicio1 {
    public static void main(String[] args) {
        // Exemplo de valores das vendas do dia
        double[] vendas = {100.50, 250.75, 300.00, 50.25, 150.10};

        // Variável para armazenar a soma total das vendas
        double totalVendas = 0.0;

        // Loop para percorrer o vetor e somar os valores
        for (double venda : vendas) {
            totalVendas += venda;
        }

        // Exibir o total de vendas do dia
        System.out.println("Total de vendas do dia: R$ " + totalVendas);
    }
}
