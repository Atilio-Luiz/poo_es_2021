import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemplo04 {
    public static void main (String[] args){ 
		String file = "/home/fox/Arquivos/arquivo01.txt"; // caminho absoluto do arquivo

		// Usando try with resources
        // Intanciando um objeto da classe BufferedReader
		try(BufferedReader br = 
            new BufferedReader(new InputStreamReader(new FileInputStream(file)))) { 

            String line; 
			
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

			System.out.println(); 
		} 
		catch( IOException e ){
			System.out.println("ERRO: " + e.getMessage());
		}
	}
}
