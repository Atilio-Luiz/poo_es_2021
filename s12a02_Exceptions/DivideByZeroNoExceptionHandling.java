
// Integer division without exception handling.
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
   // demonstrates throwing an exception 
   // when a divide-by-zero occurs
   public static int quotient(int num, int den) {
      return num / den; // possible division by zero
   } 

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); 

      System.out.print("Enter an integer numerator: ");
      int numerator = scanner.nextInt();
      System.out.print("Enter an integer denominator: ");
      int denominator = scanner.nextInt();

      int result = quotient(numerator, denominator);
      System.out.printf("%nResult: %d / %d = %d%n", 
         numerator, denominator, result);
   }
} 
