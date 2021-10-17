public class Programa05 {
  public static void main(String[] args) {
    final double CM_POR_POLEGADA = 2.54; // uma constante
    double larguraPapel = 8.5;
    double alturaPapel = 11;
    System.out.println("Tamanho do papel em centimetros: "
        + larguraPapel * CM_POR_POLEGADA + " por " 
        + alturaPapel * CM_POR_POLEGADA);
  }
}