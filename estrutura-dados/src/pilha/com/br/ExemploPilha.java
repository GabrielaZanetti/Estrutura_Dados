package pilha.com.br;

import java.util.Scanner;

public class ExemploPilha {

    public static void main(String args[]) {
        Pilha p = new Pilha();
        Scanner tipo = new Scanner(System.in);

        int escolha = -1;
        int valor;
        int[] element = p.getPilha();

        while (escolha != 0) {
            System.out.println(p);
            System.out.println("Digite a operacao:");
            System.out.println("1 Empilha");
            System.out.println("2 Desempilha");
            System.out.println("3 Esvazia Pilha");
            System.out.println("4 Listar Pilha");
            System.out.println("5 Nova Pilha");
            System.out.println("0 Sair");

            escolha = tipo.nextInt();

            if (escolha == 1) {
                System.out.println("Insira o valor a ser empilhado: ");
                valor = tipo.nextInt();
                p.push(valor);
            }

            if (escolha == 2) {
                valor = p.pop();
                System.out.println("Desempilhado " + valor);
            }

            if (escolha == 3) {
                while (!p.isEmpty()) {
                    valor = p.pop();
                    System.out.println("Desempilhado " + valor);

                }
            }
            
            if (escolha == 4) {
                for(int n : element){
                    System.out.println(element[n]);
                }
            }
            
            if (escolha == 5) {
                int[] novoElement = p.novaPilha();
                System.out.println("Sua Nova Pilha");
                for(int n : novoElement){
                    System.out.println(novoElement[n]);
                }
            }
        }

    }
}
