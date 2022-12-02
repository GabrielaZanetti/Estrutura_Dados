package com.acme;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num[] = new int[10];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite o " + (i + 1) + " o numero: ");
            num[i] = input.nextInt();
        }
        bubbleSort(num, num.length);
        System.out.println("Ordem decrescente");
        for (int i = 0; i < num.length; i++) {
            System.out.println((i + 1) + " o numero: " + num[i]);
        }
        
    }
    public static void bubbleSort(int[] x, int quant) {
        int n, i, aux;
        for (n = 1; n < quant; n++) {
            for (i = 0; i < quant; i++) {
                if (x[i] < x[n]) {
                    aux = x[n];
                    x[n] = x[i];
                    x[i] = aux;
                }
            }
        }
    }
}
