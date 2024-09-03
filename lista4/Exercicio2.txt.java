package com.poo.lista4;

public class Exercicio2 {
    public static void main(String[] args) {
        // Exemplo de valores das vendas do dia
        double[] vendas = {100.50, 250.75, 300.00, 50.25, 150.10};

        // Inicializa variáveis para armazenar o menor e o maior valor
        double menorValor = vendas[0];
        double maiorValor = vendas[0];

        // Loop para percorrer o vetor e encontrar o menor e o maior valor
        for (double venda : vendas) {
            if (venda < menorValor) {
                menorValor = venda;
            }
            if (venda > maiorValor) {
                maiorValor = venda;
            }
        }

        // Exibir o menor e o maior valor de vendas do dia
        System.out.println("Compra de menor valor: R$ " + menorValor);
        System.out.println("Compra de maior valor: R$ " + maiorValor);
    }
}
