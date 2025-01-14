package com.rayan.urlshortener;

import java.util.Scanner;

/**
 * Explicação: Este programa inverte a string sem usar funções prontas.
 * Ele começa do final da string e vai concatenando os caracteres ao novo valor da string invertida.
 */
public class Teste5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine().toLowerCase();

        if (input.isEmpty() || input.isBlank()) {
            System.out.println("String vazia.");
            return;
        }

        String invertida = inverterString(input);

        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String input) {
        String invertida = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            invertida += input.charAt(i);
        }
        return invertida;
    }
}
