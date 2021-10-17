public class Programa13 {
    public static void main(String[] args) {
        // Declarando array e inicializando
        int[] array = new int[10];

        System.out.printf("%s%8s%n", "Indice", "Valor");

        for(int c = 0; c < array.length; c++) {
            System.out.printf("%6d%8d%n", c, array[c]);
        }
    }
}