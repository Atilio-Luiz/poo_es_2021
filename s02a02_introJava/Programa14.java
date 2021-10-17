public class Programa14 {
  public static void main(String[] args) {
    // Declarando array e inicializando
    int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

    System.out.printf("%s%8s%n", "Indice", "Valor");

    for(int c = 0; c < array.length; c++) {
      System.out.printf("%6d%8d%n", c, array[c]);
    }
  }
}