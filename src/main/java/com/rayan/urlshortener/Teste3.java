package com.rayan.urlshortener;

import org.json.JSONArray;
import org.json.JSONObject;

public class Teste3 {
    public static void main(String[] args) {
        String jsonData = "[{\"dia\":\"2025-01-01\", \"faturamento\":20000}, {\"dia\":\"2025-01-02\", \"faturamento\":30000}, {\"dia\":\"2025-01-03\", \"faturamento\":25000}, {\"dia\":\"2025-01-04\", \"faturamento\":0}]";
        JSONArray faturamentoArray = new JSONArray(jsonData);

        double somaFaturamento = 0;
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        int diasComFaturamento = 0;

        for (int i = 0; i < faturamentoArray.length(); i++) {
            JSONObject dia = faturamentoArray.getJSONObject(i);
            double valor = dia.getDouble("faturamento");

            if (valor > 0) {
                somaFaturamento += valor;
                diasComFaturamento++;
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
            }
        }

        double mediaMensal = somaFaturamento / diasComFaturamento;

        int diasAcimaMedia = 0;
        for (int i = 0; i < faturamentoArray.length(); i++) {
            JSONObject dia = faturamentoArray.getJSONObject(i);
            double valor = dia.getDouble("faturamento");
            if (valor > mediaMensal) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor Faturamento: R$" + menorFaturamento);
        System.out.println("Maior Faturamento: R$" + maiorFaturamento);
        System.out.println("Dias com faturamento superior à média: " + diasAcimaMedia);
    }
}
