package com.acme;

import java.util.Scanner;

public class ExemploArvore {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // cria a arvore com o elemento inicial
//        Arvore arvore = new Arvore(new Elemento(5));

        // Insere elemento na árvore
//        arvore.inserir(new Elemento(1));
        
        int[] num = new int[2];
        int quant = num.length;
        
        for (int i = 0; i < quant; i++) {
//            System.out.println(num[i]);
            System.out.println("Informe o numero " + (i+1));
            int value = input.nextInt();
            num[i] = value;
        }
        
        bubbleSort(num, quant);
       
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }

        // Realiza a busca
//        System.out.println("O elemento 1" + (arvore.busca(1) ? " foi encontrado" : "nao foi encontrado"));
    }
     public static void bubbleSort(int[] x, int quant) {
        int n, i, aux;
        /*
                Cria-se dois lacos de repeticao onde possuem a mesma funcao
                assim percorre o mesmo array verificando cada valor, dentro fo if
                ele verifica se o valor da posicao X e maior que I, onde se for ele 
                armazena no array e segue para o proximo
         */
        
        for (n = 0; n < x.length; n++) {
            for (i = 0; i < quant; i++) {
                if (x[n] > x[i + 1]) {
                    aux = x[n];
                    x[n] = x[n + 1];
                    x[n + 1] = aux;
                }
            }
        }
    }


}
