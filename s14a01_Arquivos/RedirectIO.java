import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class RedirectIO {
    public static void main(String[] args) {
        // using try-with-resources
        try (
                OutputStream outStream = new FileOutputStream("/home/fox/Arquivos/saida.txt");
                PrintStream printOut = new PrintStream(outStream);
            )
        {
            System.setOut(printOut);
            System.out.println("Programa de teste");
            System.out.println("Redirecionando o System.out");
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}