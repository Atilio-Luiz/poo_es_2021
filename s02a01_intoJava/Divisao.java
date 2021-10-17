import java.util.Locale;

class Divisao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int a = 10;
        int b = 4;
        double res = (double) a / b;
        System.out.printf("Resultado = %.2f%n", res);
    }
}