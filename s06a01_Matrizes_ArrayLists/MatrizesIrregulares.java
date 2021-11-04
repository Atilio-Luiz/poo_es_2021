public class MatrizesIrregulares {
    public static void main(String[] args) {

        int[][] array1 = { { 1 }, { 2, 3 }, { 4, 5, 6 } };
        int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6} };

        System.out.println("Valores no array1 passados na linha são");
        outputArray( array1 ); //exibe o array 2 por linha

        System.out.println("Valores no array2 passados na linha são");
        outputArray( array2 ); //exibe o array 2 por linha
    }
    
    public static void outputArray(int[][] array) {
        for(int linha = 0; linha < array.length; linha++ ) {
            for( int coluna = 0; coluna < array[linha].length; coluna++ )
                System.out.printf("%d ", array[linha][coluna]);
            System.out.println();
        }
    }
}