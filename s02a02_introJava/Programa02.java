import java.util.Locale;
import java.util.Scanner;

class Programa02 {
   public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner input = new Scanner(System.in);

       int minutos = input.nextInt();

       double conta = 50.00;
       if(minutos > 100) {
           conta += (minutos - 100) * 2.0;
       }

       System.out.printf("Valor da conta = R$ %.2f%n", conta);

       input.close();
   }
}