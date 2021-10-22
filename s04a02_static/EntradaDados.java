import java.util.Scanner;

class EntradaDados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(
            "Digite 3 inteiros separados por espaço: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int resultado = maximo(num1, num2, num3);
        System.out.println("Máximo é: " + resultado);
    }

    public static int maximo(int x, int y, int z) {
        int maior = x;
        maior = (y > maior) ? y : maior;
        maior = (z > maior) ? z : maior;
        return maior;
    }
}