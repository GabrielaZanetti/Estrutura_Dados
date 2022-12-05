package com.acme;

public class Arvore {

    private Elemento ele;
    private Arvore dir;
    private Arvore esq;

    public Arvore() {
        this.ele = null;
        this.esq = null;
        this.dir = null;
    }

    public Arvore(Elemento elem) {
        this.ele = elem;
        this.dir = null;
        this.esq = null;
    }

    // verificações
    public boolean isEmpty() {
        return (this.ele == null);
    }

    public void inserir(Elemento novo) {
        if (isEmpty()) {
            this.ele = novo;
        } else {
            Arvore novaArvore = new Arvore(novo);
            if (novo.getValor() < this.ele.getValor()) {  // Insere na esquerda
                if (this.esq == null) {  // nó folha
                    this.esq = novaArvore;
                } else {
                    this.esq.inserir(novo); // passa para a sub-árvore esquerda
                    System.out.println("Elemento " + novo.getValor() + " inserido a esquerda de " + this.ele.getValor());
                }
            } else if (novo.getValor() > this.ele.getValor()) { // Insere na direita
                if (this.dir == null) {
                    this.dir = novaArvore;

                } else {
                    this.dir.inserir(novo); // passa para a sub-árvore direita
                    System.out.println("Elemento " + novo.getValor() + " inserido a direita de " + this.ele.getValor());
                }
            }
        }
    }

    // Método de Pesquisa
    public boolean busca(int valor) {
        if (isEmpty()) {
            return false;
        }

        if (this.ele.getValor() == valor) {
            return true;
        } else {
            if (valor < this.ele.getValor()) {
                if (this.esq == null) {
                    return false;
                } else {
                    return this.esq.busca(valor); // segue a subarvore esquerda
                }
            } else if (valor > this.ele.getValor()) {
                if (this.dir == null) {
                    return false;
                } else {
                    return this.dir.busca(valor); // segue a subarvore direita
                }
            }
            return false;
        }
    }

    public void setElemento(Elemento ele) {
        this.ele = ele;
    }

    public void setDir(Arvore dir) {
        this.dir = dir;
    }

    public void setEsq(Arvore esq) {
        this.esq = esq;
    }

    public String visualiza(Arvore aux) {
        String retorno = "";

        if (aux != null) {  //  verifica se a arvore nao e nula
            retorno += aux.ele.getValor();
            if (aux.esq != null) { //    busca apenas os valores da esquerda se nao for nulo
                retorno += "\n";
                retorno += this.visualiza(aux.esq);
            }
            if (aux.dir != null) { //    busca apenas os valores da direita se nao for nulo
                retorno += "\n";
                retorno += this.visualiza(aux.dir);
            }
        }
        return retorno;
    }

    public Arvore remover(Arvore aux, int num) {
        Arvore p, r = null;
        if (aux.ele.getValor() == num) { // verifica se o valor e a raiz
            if (aux.esq == aux.dir) {
                return null;
            } else if (aux.esq == null) {
                return aux.dir;
            } else if (aux.dir == null) {
                return aux.esq;
            } else {
                p = aux.dir;
                while (p.esq != null) {
                    r = p;
                    p = p.esq;
                }
                p = null;
                r.esq = null;
                return aux;
            }
        } else if (aux.ele.getValor() < num) { // verifica se o valor esta a direita e busca a direita da arvore
            aux.dir = remover(aux.dir, num);
        } else { 
            aux.esq = remover(aux.esq, num);// verifica se o valor esta a esquerda e busca a esquerda da arvore
        }
        System.out.println("elemento "+num+" removido");
        return aux;
    }

    public void bubbleSort(int[] x, int quant) {
        /*
               Cria-se dois lacos de repeticao onde possuem a mesma funcao
               assim percorre o mesmo array verificando cada valor, dentro fo if
               ele verifica se o valor da posicao X e maior que I, onde se for ele 
               armazena no array e segue para o proximo
         */
        int n, i, aux;
        for (n = 1; n < quant; n++) {
            for (i = 0; i < quant; i++) {
                if (x[i] > x[n]) {
                    aux = x[n];
                    x[n] = x[i];
                    x[i] = aux;
                }
            }
        }
    }
}
