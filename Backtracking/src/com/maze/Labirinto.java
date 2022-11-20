package com.maze;

public class Labirinto {
    /*  VERIFICA SE A LINHA E A COLUNA ESTA NA MATRIZ E SE AS MESMAS SAO MAIORES QUE 0 E SE A POSICAO E IGUAL A 1   */
    public static boolean caminhoSeguro(int[][] arr, int linha, int coluna){
        return( linha < arr.length && coluna < arr.length && coluna >= 0 && linha >= 0 && arr[linha][coluna] == 1 );
    }
    
    /*  RETORNA UM VALOR BOLLEANO SE O CAMINHO FOR 0 OU 1   */
    public static boolean acharOcaminhoUtil(int[][] arr, int[][] solu, int linha, int coluna){
        /*  VERIFICA SE O CAMINHO CHEGOU AO FIM  */
        if( linha == arr.length - 1 && coluna == arr.length - 1 && arr[linha][coluna] == 1){
            solu[linha][coluna] = 1;
            return true;
        }
        
        if( caminhoSeguro(arr, linha, coluna) ){
            solu[linha][coluna] = 1;
            
            /*  MOVE PARA BAIXO  */
            if( acharOcaminhoUtil(arr, solu, linha + 1, coluna) ){
                return true;
            }
            /*  MOVE PARA A DIREITA  */
            if( acharOcaminhoUtil(arr, solu, linha, coluna + 1 ) ){
                return true;
            }
            
            /*  SE A CASO AS OPCOES A CIMA FALHAREM A BUSCA RECOMECA    */
            solu[linha][coluna] = 0;
            return false;
        }
        return false;
    }
    
    /*  FUNCAO PARA PRINTAR O LABIRINTO  */
    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    /*  CRIA A FUNCAO PARA BUSCAR O CAMINHO ATE O FINAL DO LABIRINTO    */
    public static void acharOcaminho(int[][] arr, int tamanho){
        int[][] solucao = new int[tamanho][tamanho];
        
        if( acharOcaminhoUtil(arr, solucao, 0, 0) ){
            printArray(solucao);
        } else {
            System.out.println("Sem Solucao");
        }
    }

    public static void main(String[] args) {
        //  CRIACAO DE UMA MATRIZ PARA REPRESENTAR O LABIRINTO DE 4 X 4
            //  1 - caminho livre; 0 - parede;
            int labirinto[][] = {{1, 1, 0, 0},
                                 {1, 1, 0, 0},
                                 {1, 1, 0, 0},
                                 {0, 1, 1, 1}};
            int tamanho = labirinto.length;
            
            acharOcaminho(labirinto, tamanho);
    }
}