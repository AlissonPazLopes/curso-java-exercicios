package program;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz: ");
        System.out.println("Digite a quantidade linhas: ");
        int n = sc.nextInt();
        System.out.println("Digite a quantidade de colunas: ");
        int m = sc.nextInt();
        int[][] matriz = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("linha: %d%n", i+1);
                System.out.printf("coluna: %d%n", j+1);
                System.out.println("Numero que voce quer adicionar: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        int negatives = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (matriz[i][j] < 0){
                    negatives = negatives + 1;
                }
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("Números negativos: ");
        System.out.println(negatives);
        System.out.println("Digite um número para buscarmos quem está acima, abaixo, a esquerda e a direita: ");
        int numero = sc.nextInt();
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                if (numero == matriz[i][j]){
                    int linha = i;
                    int coluna = j;
                    if(m >= 3 && n >= 3 && linha > 0 && coluna > 0 && linha < n-1 && coluna < m-1){
//                        System.out.printf("acima: %d", matriz[i-1][j]);
//                        System.out.printf("abaixo: %d", matriz[i+1][j]);
//                        System.out.printf("esquerda: %d", matriz[i][j-1]);
//                        System.out.printf("direita: %d", matriz[i][j+1]);
                        System.out.println();
                        System.out.printf("Posicao: %d,%d", i, j);
                        System.out.println();
                        System.out.printf("        %d", matriz[i-1][j]);//acima
                        System.out.printf("%n        ^  ");
                        System.out.printf("%n        |  %n");
                        System.out.printf(" %d", matriz[i][j-1]);//esquerda
                        System.out.printf("  <-  ");
                        System.out.printf("%d", matriz[i][j]);
                        System.out.printf("  ->  ");
                        System.out.printf("%d", matriz[i][j+1]);//direita
                        System.out.printf("%n        ↓  %n");
                        System.out.printf("        %d", matriz[i+1][j]);//abaixo
                    }
                    //linha 0 e coluna 0
                    if(linha == 0 && coluna == 0){
                        System.out.println();
                        System.out.printf("Posicao: %d,%d", i, j);
                        System.out.println();
                        System.out.printf("%d", matriz[i][j]);
                        System.out.printf("  ->  ");
                        System.out.printf("%d", matriz[i][j+1]);//direita
                        System.out.printf("%n        ↓  %n");
                        System.out.printf("        %d", matriz[i+1][j]);//abaixo
                    }
                    //primeira coluna e ultima coluna
                    if(linha == 0 && coluna == m-1){
                        System.out.println();
                        System.out.printf("Posicao: %d,%d", i, j);
                        System.out.println();
                        System.out.println();
                        System.out.printf(" %d", matriz[i][j-1]);//esquerda
                        System.out.printf("  <-  ");
                        System.out.printf("%d", matriz[i][j]);
                        System.out.printf("%n        ↓  %n");
                        System.out.printf("        %d", matriz[i+1][j]);//abaixo
                    }
                    //primeira linha  e a coluna ser depois da primeira e antes da ultima
                    if(linha == 0 && coluna > 0 && coluna < m-2){
                        System.out.println();
                        System.out.printf("Posicao: %d,%d", i, j);
                        System.out.println();
                        System.out.printf(" %d", matriz[i][j-1]);//esquerda
                        System.out.printf("  <-  ");
                        System.out.printf("%d", matriz[i][j]);
                        System.out.printf("  ->  ");
                        System.out.printf("%d", matriz[i][j+1]);//direita
                        System.out.printf("%n        ↓  %n");
                        System.out.printf("        %d", matriz[i+1][j]);//abaixo
                    }
                    // ultima linha e primeira coluna
                    if(linha == n-1 && coluna == 0 ){
                        System.out.println();
                        System.out.printf("Posicao: %d,%d", i, j);
                        System.out.println();
                        System.out.printf("        %d", matriz[i-1][j]);//acima
                        System.out.printf("%n        ^  ");
                        System.out.printf("%n        |  %n");
                        System.out.printf(" %d", matriz[i][j-1]);//esquerda
                        System.out.printf("  <-  ");
                        System.out.printf("%d", matriz[i][j]);
                    }
                    //ultima linha e ultima coluna
                    if(linha == n-1 && coluna == m-1 ){
                        System.out.println();
                        System.out.printf("Posicao: %d,%d", i, j);
                        System.out.println();
                        System.out.printf("        %d", matriz[i-1][j]);//acima
                        System.out.printf("%n        ^  ");
                        System.out.printf("%n        |  %n");
                        System.out.printf(" %d", matriz[i][j-1]);//esquerda
                        System.out.printf("  <-  ");
                        System.out.printf("%d", matriz[i][j]);
                    }
                    //ultima linha mas maior que a primeira coluna e menor que a ultima
                    if (linha == n-1  && coluna < m-1 && coluna > 0){
                        System.out.println();
                        System.out.printf("Posicao: %d,%d", i, j);
                        System.out.println();
                        System.out.printf("        %d", matriz[i-1][j]);//acima
                        System.out.printf("%n        ^  ");
                        System.out.printf("%n        |  %n");
                        System.out.printf(" %d", matriz[i][j-1]);//esquerda
                        System.out.printf("  <-  ");
                        System.out.printf("%d", matriz[i][j]);
                        System.out.printf("  ->  ");
                        System.out.printf("%d", matriz[i][j+1]);//direita
                    }
                }
            }
        }
    }
}
