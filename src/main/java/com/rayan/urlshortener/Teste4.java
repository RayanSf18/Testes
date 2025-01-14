package com.rayan.urlshortener;

/**
 * Explicação: O código calcula o total de faturamento somando os valores fornecidos para cada estado.
 * Em seguida, calcula o percentual de cada estado no total, dividindo o faturamento de cada estado pelo faturamento total e multiplicando por 100.
 */
public class Teste4 {
    public static void main(String[] args) {
        double[] faturamentos = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
        double totalFaturamento = 0;

        for (double faturamento : faturamentos) {
            totalFaturamento += faturamento;
        }

        String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};

        for (int i = 0; i < faturamentos.length; i++) {
            double percentual = (faturamentos[i] / totalFaturamento) * 100;
            System.out.println("Percentual de " + estados[i] + ": " + String.format("%.2f", percentual) + "%");
        }
    }
}
