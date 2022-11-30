package arvore.com.br;

import java.util.Scanner;

/*
    Utilizar os codigos do classroom para solicitar os valores a serem inseridos e pesqiisados
 */
public class ExemploArvore {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        boolean busca = true;
        
        // cria a arvore com o elemento inicial
        Arvore arvore = new Arvore(new Elemento(5));
        
        while ( busca ) {
            System.out.println("---------------------------------------");
            System.out.println("|                                     |");
            System.out.println("| 1 - Insira um valor                 |");
            System.out.println("| 2 - Busque um valor                 |");
            System.out.println("| 3 - Finalizar tarefa                |");
            System.out.println("|                                     |");
            System.out.println("---------------------------------------");
            
            System.out.print("Informe uma opcao: ");
            int option = input.nextInt();
            
            switch (option) {
                case 1 -> {
                    System.out.print("Insira um valor: ");
                    int val = input.nextInt();
                    arvore.inserir(new Elemento(val));
                }
                case 2 -> {
                    System.out.print("Insira um valor de busca: ");
                    int val = input.nextInt();
                    System.out.println("O elemento "+ val + (arvore.busca(val) ? " foi encontrado" : " nao foi encontrado"));
                }
                case 3 -> {
                    busca = false;
                }
                default -> {
                    busca = false;
                }
            }
        }
    }
}
