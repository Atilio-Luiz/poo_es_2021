// Pointer-flutuation division without exception handling.
import java.util.Locale;
import java.util.Scanner;

public class DivideByZeroDouble {
   // demonstrates throwing an exception 
   // when a divide-by-zero occurs
   public static double quotient(double num, double den) {
      return num / den; // possible division by zero
   } 

   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in); 

      System.out.print("Enter a numerator: ");
      double numerator = scanner.nextDouble();
      System.out.print("Enter a denominator: ");
      double denominator = scanner.nextDouble();

      double result = quotient(numerator, denominator);
      System.out.printf("%nResult: %.2f / %.2f = %.2f%n", 
         numerator, denominator, result);
   }
} 