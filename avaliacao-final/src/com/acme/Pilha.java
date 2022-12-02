package com.acme;

public class Pilha {

    private int elementos[] = new int[5];
    private int topo = -1;

    public void push(int e) {
        if (isFull()) {
            throw new RuntimeException("Pilha Cheia!");
        }

        topo++;
        elementos[topo] = e;

    }

    public int pop() {

        if (isEmpty()) {
            throw new RuntimeException("Pilha Cheia!");
        }
        int e;
        e = elementos[topo];
        topo--;
        return e;
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public boolean isFull() {
        return (topo == 9);
    }

    public int top() {
        return elementos[topo];
    }

    //lista a lista na tela
    public void listar() {
        //inicia um novo vetor para operar
        int a = 1;
        System.out.println("");
        for (int cont = 0; cont <= topo; cont++) {

            System.out.println(a + " valor = " + elementos[cont]);
            a++;
        }
        System.out.println("");
    }
    
    //lista a lista invertida na tela
    public void listarInvertida() {
        //inicia um novo vetor para operar
        int a = 1;
        System.out.println("");
        for (int cont = topo; cont >= 0; cont--) {

            System.out.println(a + " valor = " + elementos[cont]);
            a++;
        }
        System.out.println("");
    }

    public int tops() {
        return topo;
    }

    public int[] pegarL() {
        return elementos;
    }

    public void clona(Pilha k) {
        for (int cont = 0; cont <= topo; cont++) {
            k.push(elementos[cont]);
        }
    }
}
