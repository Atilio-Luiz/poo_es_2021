import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    /**
     * Lê o conteúdo de um arquivo e imprime na tela
     * Esse método pode lançar uma exceção verificada, 
     * do tipo FileNotFoundException
     */
    public static void lerArquivo1() throws FileNotFoundException {
        String nome = "poema1.txt";        
        File file = new File(nome);
        Scanner entrada = new Scanner(file);
        
        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }

        entrada.close();
    }

    public static void lerArquivo2() throws FileNotFoundException, IOException {
        FileReader file = new FileReader("poema2.txt");      

        int ch = file.read();
        while (ch != -1) {
            System.out.print((char)ch);
            ch = file.read();
        }

        file.close();
    }

    /** Main */
    public static void main(String[] args) {
        try {
            lerArquivo1();
        }
        catch (FileNotFoundException e) {
            System.err.println("erro: " + e.getMessage());
        }

        System.out.println();

        try {
            lerArquivo2();
        }
        catch (FileNotFoundException e) {
            System.out.println("erro: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("erro: " + e.getMessage());
        }
    }
  
}
