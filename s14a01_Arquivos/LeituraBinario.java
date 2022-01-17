import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;

public class LeituraBinario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String fileName = "/home/fox/Arquivos/data.bin";
        
        // using try-with-resources
        try (
                FileInputStream fstream = new FileInputStream(fileName);
                DataInputStream outputFile = new DataInputStream(fstream);
            )
        {
            boolean endOfFile = false;
            while(endOfFile == false) {
                try {
                    String firstName = outputFile.readUTF();
                    String lastName = outputFile.readUTF();
                    byte age = outputFile.readByte();
                    double salary = outputFile.readDouble();

                    System.out.printf("Name: %s, Last name: %s, Age: %d, Salary: %.2f%n", 
                        firstName, lastName, age, salary);
                }
                catch(EOFException e) {
                    endOfFile = true;
                }
            }
        }
        catch(FileNotFoundException e) {
            System.err.println("File not found");
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}