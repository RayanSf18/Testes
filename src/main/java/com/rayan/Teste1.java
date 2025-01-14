package com.rayan;


/**
 * Explicação: O código usa um loop while para somar os números de 1 até 13. Inicialmente, SOMA começa com 0 e K com 0.
 * A cada iteração do loop, o valor de K é incrementado em 1 e somado à variável SOMA.
 * O loop termina quando K chega a 13, e o valor final de SOMA será a soma de todos os números de 1 a 13, ou seja, 91.
 *
 */
public class Teste1 {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("SOMA: " + SOMA);
    }
}