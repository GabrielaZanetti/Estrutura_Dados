package com.acme;

import java.util.Scanner;

public class ExemploArvore {

    public static void main(String args[]) {
        Arvore arvore = new Arvore();
        Scanner input = new Scanner(System.in);
        //  Criando um vetor com 10 pisicoes
        int[] num = new int[5];
        int quant = num.length;
        
        System.out.println("Criar uma arvore");
        
        // inserindo os valores no vetor ao pedir por meio do teclado
        for (int i = 0; i < quant; i++) {
            System.out.println("Informe o numero " + (i+1));
            int value = input.nextInt();
            num[i] = value;
        }
        
        // ordenacao pelo metodo bubble sort
        arvore.bubbleSort(num, quant);
        
        //  Print do vetor ordenado
        System.out.println("Vetor ordenado: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        
        //  criacao da arvore binaria apartir do vetor inicial
        arvore.inserir(new Elemento(num[num.length/2])); // pega o valor da metade do array
        for (int i = 0; i < num.length; i++) {
            arvore.inserir(new Elemento(num[i]));
        }
        
        /*  Menu de opcoes  */
        boolean menuAtivo = true;
        
        while(menuAtivo){
            System.out.println("Informe uma opcao para efetuar na arvore");
            System.out.println("1 - Inserir um novo item na arvore");
            System.out.println("2 - Pesquisar um item na arvore");
            System.out.println("3 - Remover um item da arvore");
            System.out.println("4 - Visualizar a arvore");
            System.out.println("5 - Finalizar a operacao");
            int opcao = input.nextInt();
            switch (opcao) {
                case 1 -> {
                    // Solicitacao de um valor para inserir na arvore
                    System.out.println("Informe um numero para inserir na arvore");
                    int inserirValue = input.nextInt();
                    arvore.inserir(new Elemento(inserirValue));
                    menuAtivo = true;
                }
                case 2 -> {
                    // Solicitacao de um valor para busca na arvore
                    System.out.println("Informe um numero para buscar na arvore");
                    int valueBusca = input.nextInt();
                    System.out.println("O elemento "+ valueBusca+" "+ (arvore.busca(valueBusca) ? "foi encontrado" : "nao foi encontrado"));
                    menuAtivo = true;
                }
                case 3 -> {
                    // Solicitacao de um valor para remover sa arvore
                    System.out.println("Informe um numero para remover da arvore");
                    int valueRemove = input.nextInt();
                    arvore.remover(arvore, valueRemove);
                    menuAtivo = true;
                }
                case 4 -> {
                    /*  Visualizar a arvore     */
                    System.out.println(arvore.visualiza(arvore));                        
                    menuAtivo = true;
                }
                case 5 -> {
                    menuAtivo = false;
                }
                default -> {
                    menuAtivo = false;
                }
            }
        }
    }

}