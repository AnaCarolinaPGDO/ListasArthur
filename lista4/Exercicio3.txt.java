package com.poo.lista4;

public class Exercicio3 {
    public static void main(String[] args) {
        // Exemplo de valores das vendas do dia
        double[] vendas = {100.50, 250.75, 300.00, 50.25, 150.10};

        // Variável para armazenar a soma total das vendas
        double totalVendas = 0.0;

        // Loop para percorrer o vetor e somar os valores
        for (double venda : vendas) {
            totalVendas += venda;
        }

        // Calcula o número de vendas realizadas
        int numeroDeVendas = vendas.length;

        // Calcula o ticket médio
        double ticketMedio = totalVendas / numeroDeVendas;

        // Exibir o total de vendas e o ticket médio do dia
        System.out.println("Total de vendas do dia: R$ " + totalVendas);
        System.out.println("Ticket médio de vendas do dia: R$ " + ticketMedio);
    }
}
