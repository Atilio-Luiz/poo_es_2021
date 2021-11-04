import java.util.Scanner;

/**
 * Uma classe que testa matrizes
 */
public class TesteMatriz {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = input.nextInt();
        int[][] matriz = new int[n][n]; // uma matriz quadrada de ordem n
        preencheMatriz(matriz);
        imprimeMatriz(matriz);
        
        int[][] matriz2 = {{7,8,9,6,5}, {3,4,1}, {7}, {6,8,9,7}}; // uma matriz irregular
        imprimeMatriz(matriz2);
    }

    public static void preencheMatriz(int[][] m) {
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
    }

    public static void imprimeMatriz(int[][] m) {
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " "); 
            }
            System.out.println();
        }
    }
}