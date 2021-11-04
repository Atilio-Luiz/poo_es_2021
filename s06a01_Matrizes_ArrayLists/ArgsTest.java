import java.util.Locale;

/**
 * A classe ArgsTest testa um método com uma lista 
 * de argumentos de tamanho variável.
 */
public class ArgsTest {
    /**
     * O método average calcula a média de uma quantidade 
     * variável de argumentos do tipo double
     * @param numbers lista de tamanho variável do tipo double
     * @return a média dos argumentos
     */
    public static double average(double... numbers) {
        double total = 0.0;
        // calcula o somatorio dos números usando um enhanced-for
        for(double d : numbers) {
            total += d;
        }
        return total / numbers.length;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;

        System.out.printf("Média de d1 e d2 é %.2f%n", average(d1, d2));
        System.out.printf("Média de d1, d2 e d3 é %.2f%n", average(d1, d2, d3));
        System.out.printf("Média das quatro notas é %.2f%n", average(d1, d2, d3, d4));
    }
}