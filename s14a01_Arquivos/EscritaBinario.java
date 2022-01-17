import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class EscritaBinario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String fileName = "/home/fox/Arquivos/data.bin";

        // using try-with-resources
        try (
                FileOutputStream fstream = 
                    new FileOutputStream(fileName, true); // append
                DataOutputStream outputFile = 
                    new DataOutputStream(fstream);
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

                outputFile.writeUTF(firstName);
                outputFile.writeUTF(lastName);
                outputFile.writeByte(age);
                outputFile.writeDouble(salary);

                System.out.println("Continuar? (s/n)");
                if(sc.next().equals("n")) break;

            } while(true);
        }
        catch(FileNotFoundException e) {
            System.err.println("File not found");
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}