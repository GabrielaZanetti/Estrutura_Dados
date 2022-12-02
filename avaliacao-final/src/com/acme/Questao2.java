package com.acme;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Pilha p = new Pilha();

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe a posicao " + (i + 1) + ": ");
            int valor = input.nextInt();
            p.push(valor);
        }
        //  Testa se está vazia para caso for não operar
        if (!p.isEmpty()) {
            //  listar é o comando para pegar o vetor já que ele é um objeto privado da clase Pilha
            System.out.println("Pilha original");
            p.listar();

        } else {
            System.out.println("Pilha Vazia ");
        }

        Pilha k = new Pilha();

        p.clona(k);
        System.out.println("Pilha clonada e invertida");
        k.listarInvertida();
    }
}
