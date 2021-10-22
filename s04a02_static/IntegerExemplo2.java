/**
 * A classe IntegerExemplo2 testa alguns dos
 * métodos estáticos da classe wrapper Integer
 */
class IntegerExemplo2 {
    public static void main(String[] args) {
        int a = 34, b = 5;
        System.out.println("Máximo: " + Integer.max(a, b));
        System.out.println("Mínimo: " + Integer.min(a, b));
        System.out.printf("int para String: %s%n", Integer.toString(a));
        System.out.printf("int para String: %s%n", Integer.toString(b));

        String str = "4352";
        System.out.printf("String para int: %d%n", Integer.parseInt(str));

        System.out.println("decimal 345 convertido para decimal: " + Integer.parseInt("345", 10));
        System.out.println("hexadecimal AB convertido para decimal: " + Integer.parseInt("AB", 16));
        System.out.println("octal 20 convertido para decimal: " + Integer.parseInt("20", 8));
        System.out.println("binário 1010110 convertido para decimal: " + Integer.parseInt("1010110", 2));
    }
}