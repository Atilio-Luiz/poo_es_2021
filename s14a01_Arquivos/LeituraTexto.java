import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class LeituraTexto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        File file = new File("/home/fox/Arquivos/data.txt");
        
        // using try-with-resources
        try (
                Scanner inputFile = new Scanner(file, StandardCharsets.UTF_8);
            )
        {       
            while(inputFile.hasNext()) {
                String firstName = inputFile.next();
                String lastName = inputFile.next();
                byte age = inputFile.nextByte();
                double salary = inputFile.nextDouble();

                System.out.printf("Name: %s, Last name: %s, Age: %d, Salary: %.2f%n", 
                    firstName, lastName, age, salary);
            } 
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid input");
        }
        catch(FileNotFoundException e) {
            System.err.println("File not found");
        }
        catch(IOException e) {
            System.err.println("I/O Exception");
        }
    }
}