package com.acme;


import java.util.Scanner;


public class EstruturaDados {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Digite a quantidade: ");
        int quant = in.nextInt();


        int x[] = new int[quant + 1];
        int n, i, aux;
        for (i = 0; i <= quant - 1; i++) {
            System.out.print("Digite o " + (i + 1) + " o numero: ");
            x[i] = in.nextInt();
        }


        System.out.println("Digite o modo de ordenacao: ");
        System.out.println("1 - BubbleSort");
        System.out.println("2 - SelectionSort");
        System.out.println("3 - Shell sort ");
        int option = in.nextInt();


        switch (option) {
            case 1:
                bubbleSort(x, quant);
                break;
            case 2:
                selectionSort(x);
                break;
            case 3:
                shellSort(x);
                break;
            default:
                break;
        }


        for (i = 1; i <= quant; i++) {
            System.out.println((i) + " o numero: " + x[i]);


        }
    }


    public static void selectionSort(int[] arr) {
        /*  Inicialmente comeca com um laco de repeticao onde pega o tamanho do array recebido da funcao    */
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            /*  
                apos cria outro laco com as mesmas caracteristicas onde tem funcao de verificar o 
                mesmo array e fer se os valores sao menor que o outro e assim armazenando em um outro array
                assim com os valores ordenados
            */
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            /*
                o valor retornado fica ordenado
            */
        }
    }


    public static void bubbleSort(int[] x, int quant) {
        int n, i, aux;
        /*
            Cria-se dois lacos de repeticao onde possuem a mesma funcao
            assim percorre o mesmo array verificando cada valor, dentro fo if
            ele verifica se o valor da posicao X e maior que I, onde se for ele 
            armazena no array e segue para o proximo
        */
        for (n = 0; n <= quant - 1; n++) {
            for (i = 0; i <= quant - 1; i++) {
                if (x[i] > x[i + 1]) {
                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
        }
    }


    public static void shellSort(int[] vet) {
        int i, j, temp, size = vet.length;


        int incremento = 1;
        /*
            Enquanro o valor do incremento que seria 1 for menor que o tamanho do vetor
            ele calcula adicionando o incremento
        */
        while (incremento < size) {
            incremento = 3 * incremento + 1;
        }
        /*
            Enquanro o valor do incremento que seria 1 for maior que 1 ele divide o valor
        */
        while (incremento > 1) {
            incremento /= 3;
            
            /*  apos ele cria mais um laco de repeticao onde ele armazena a posicao 
                do vetor na variavel temp, apos ele verifica quenenquanto a posicao
                do array for maior ou igual a 0 e a posicao do array for menor que 
                a posicao do array ele adiciona no incremento
            */
            for (i = incremento; i < size; i++) {
                temp = vet[i];
                j = i - incremento;
                while (j >= 0 && temp < vet[j]) {
                    vet[j + incremento] = vet[j];
                    j -= incremento;
                }
                vet[j + incremento] = temp;
            }
        }
    }
}