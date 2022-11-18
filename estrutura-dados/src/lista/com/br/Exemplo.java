package lista.com.br;

import java.util.Scanner;

public class Exemplo {
    public static void main(String args[]){
        Lista lista = new Lista();
        
        Scanner tipo = new Scanner(System.in);
        
        int escolha = -1;
        int valor;
        
        while (escolha != 0){
        System.out.println("Digite a operacao:");
        System.out.println("1 - Insere Elemento");
        System.out.println("2 - Remove Elemento");
        System.out.println("3 - Lista Elementos");
        System.out.println("4 - Pesquisar Elementos");
        System.out.println("5 - Criar uma nova lista");
        System.out.println("6 - Listar a nova lista");
        System.out.println("0 Sair");
        
        escolha = tipo.nextInt();
        
            switch (escolha) {
                case 1 -> {
                    System.out.println("Insira o valor a ser armazenado: ");
                    valor = tipo.nextInt();
                    lista.inserir(valor);
                }
                case 2 -> {
                    valor = lista.retirar();
                    System.out.println("Removido " + valor);
                }
                case 3 -> lista.listar();
                case 4 -> {
                    System.out.println("Insira o valor a ser buscado: ");
                    valor = tipo.nextInt();
                    lista.buscar(valor);
                }
                case 5 -> {
                    lista.transferir();
                }
                default -> {
                }
            }
        
        }
    }
    
}