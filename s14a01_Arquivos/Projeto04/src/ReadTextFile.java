import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        File file = new File("clients.txt");

        // open clients.txt, read its contents and close the file
        try (Scanner input = new Scanner(file)) {
            System.out.printf("%-10s%-12s%-12s%10s%n", "Account", 
                "First Name", "Last Name", "Balance");
            
            // read record from file
            while(input.hasNext()) { // while there is more to read
                // display record contents
                System.out.printf("%-10s%-12s%-12s%10.2f%n", input.nextInt(), 
                    input.next(), input.next(), input.nextDouble());
            }
        }
        catch(IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
