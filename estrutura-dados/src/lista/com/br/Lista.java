package lista.com.br;

public class Lista {
    
    private Node inicio;
    private Node inicioNew;
    
    // Cria uma lista vazia
    // Cria uma nova lista vazia
    public Lista(){
        this.inicio = null;
        this.inicioNew = null;
    }
    
    public void transferir() {
        if (inicio == null){
            System.out.println("Lista vazia!!!!");
        }
        else {
            Node aux = inicio;
            Node nova = new Node();
            while (aux != null){
                nova.setElemento(aux.getElemento());
                nova.setProximo(null);

            }
        }
    }
    
    public void buscar(int elemento){
        if (inicio == null){
            System.out.println("Lista vazia!!!!");
        } else {
            Node aux = inicio;
            int quant = 0;
            while (aux != null){
                if( aux.getElemento() == elemento ){
                    quant++;
                    System.out.println("Existe");
                    return;
                } else {
                    aux = aux.getProximo();
                }
            }
            if(quant == 0){
                System.out.println("Não Existe");
            }
        }
    }
    
    public void inserir(int elemento){
        // Insere um nó no formato Fila, ou seja, no final da Lista.
        // Criando um novo nó
        Node nova = new Node();
        nova.setElemento(elemento); // Insere o Elemento na Lista
        nova.setProximo(null); // Marca o próximo como nulo (ultimo)
        
        if (inicio == null){ // Verifica se é o primeiro elemento
            inicio = nova;            
        }
        else {      // Existe nós na lista
            Node aux;
            aux = inicio;
            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(nova);
        }
    }
    
    public void listar(){        
        if (inicio == null){
            System.out.println("Lista vazia!!!!");
        }
        else {
            Node aux = inicio;
            while (aux != null){
                System.out.println("Encontrado "+aux.getElemento());
                aux = aux.getProximo();
            }
        }
    }
    
    public void listarNova(){        
        if (inicioNew == null){
            System.out.println("Lista vazia!!!!");
        }
        else {
            Node aux = inicioNew;
            while (aux != null){
                System.out.println("Encontrado "+aux.getElemento());
                aux = aux.getProximo();
            }
        }
    }
    
    public int retirar(){
        // Remove um nó no formato Fila, ou seja, do início da Lista.
        
        if (inicio != null){ //Lista contém nós
            Node aux = inicio;
            int elemento = aux.getElemento();
            inicio = aux.getProximo();
            return elemento;
        }
        else {
            throw new RuntimeException("Lista Vazia!!!");
        }
            
    }
    
    public boolean isEmpty(){
        return this.inicio == null;
    }
}