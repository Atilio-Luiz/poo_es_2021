import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class EscritaTexto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String fileName = "/home/fox/Arquivos/data.txt";

        // using try-with-resources
        try (
                FileWriter fstream = 
                    new FileWriter(fileName, StandardCharsets.UTF_8, true);
                PrintWriter outputFile = 
                    new PrintWriter(fstream, true); // using autoflushing
            )
        {        
            Scanner sc = new Scanner(System.in);

            do {

                System.out.print("Enter the first name: ");
                String firstName = sc.next();
                System.out.print("Enter the last name: ");
                String lastName = sc.next();
                System.out.print("Enter the age: ");
                byte age = sc.nextByte();
                System.out.print("Enter the salary: ");
                double salary = sc.nextDouble();

                outputFile.printf("%s %s %d %.2f%n", 
                    firstName, lastName, age, salary);
                
                System.out.println("Continuar? (s/n)");
                String option = sc.next();
                if(option.equals("n")) break;

            } while(true);
        }
        catch(InputMismatchException e) {
            System.err.println("Invalid input: " + e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error opening the file: " + e.getMessage());
        }
    }
}