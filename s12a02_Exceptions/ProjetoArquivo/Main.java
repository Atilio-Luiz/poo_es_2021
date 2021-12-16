import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    /** Main */
    public static void main(String[] args) {
        lerArquivo();
    }

    /**
     * Lê o conteúdo de um arquivo e imprime na tela
     */
    public static void lerArquivo () {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome de arquivo texto: ");
        String nome = entrada.nextLine();
        System.out.println("Nome do arquivo: " + nome);

        
        try {
            File file = new File(nome);
            entrada = new Scanner(file);
            System.out.println("\nConteúdo do arquivo texto:");
            while (entrada.hasNextLine()) {
                System.out.println(entrada.nextLine());
            }
        }
        catch (IOException e) {
            System.err.println("Erro na abertura do arquivo: " + e.getMessage());
        }
        catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
        finally {
            entrada.close();
            System.out.println("\nBloco finally foi executado");
        }
    }
}
