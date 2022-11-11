package pilha.com.br;

public class Pilha {

    int elementos[], newelementos[];
    int topo;

    public Pilha() {
        elementos = new int[10];
        topo = -1; // posição invalida para pilha inexistente
    }
    
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
        return (topo == 4);
    }

    public int top() {
        return elementos[topo];
    }
    
    public int[] getPilha() {
//      Retorno dos valores do vetor elementos
        return elementos;
    }
    
    public int[] novaPilha() {
//      criacao do novo elemento com base no tamanho do vetor elementos
        newelementos = new int[elementos.length];
        for(int n : newelementos){
//          inclusao dos valores do elemento no novo elemento da mesma posicao
            newelementos[n] = elementos[n];
        }
        return newelementos ;
    }
}
