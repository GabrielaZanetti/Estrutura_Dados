package com.acme;

import java.util.Scanner;

public class Questao3 {
    
    public static void main(String[] args) {
        Pilha p = new Pilha();
        Pilha par = new Pilha();
        Pilha impar = new Pilha();
        int valor;
        
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe a posicao " + (i + 1) + ": ");
            valor = input.nextInt();
            p.push(valor);
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            valor = p.pop();
            if (valor % 2 == 0) {
                par.push(valor);
            } else{
                impar.push(valor);
            }
        }
        
        System.out.println("Lista original");
        p.listar();
        
        System.out.println("Lista par");
        par.listar();
        
        System.out.println("Lista impar");
        impar.listar();
    }
}