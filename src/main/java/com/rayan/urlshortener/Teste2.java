package com.rayan.urlshortener;

import java.util.Scanner;

/**
 * Explicação: O código solicita um número e verifica se ele pertence à sequência de Fibonacci.
 * A função verificarFibonacci gera os números da sequência até encontrar o número informado.
 * Se o número for encontrado, a função retorna true, caso contrário, retorna false.
 *
 */
public class Teste2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        boolean pertence = verificarFibonacci(numero);

        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificarFibonacci(int numero) {
        int a = 0, b = 1;
        if (numero == 0 || numero == 1) {
            return true;
        }

        while (b < numero) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b == numero;
    }
}
