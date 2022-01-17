import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.FileInputStream;
import java.io.IOException;

public class Exemplo03 {
    public static void main (String[] args){ 
		String file = "/home/fox/Arquivos/arquivo01.txt"; // caminho absoluto do arquivo

		// Usando try with resources
        // Intanciando um objeto da classe InputStreamReader
        // Passamos para o construtor do InputStreamReader um objeto
        // da classe FileInputStream. O objeto InputStreamReader lê os bytes 
        // traduzindo para o respectivo código Unicode
		try(InputStreamReader isr = 
			new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)) { 
            
            // usando o método getEncoding() da classe InputStreamReader
            // para pegar a codificação usada no arquivo
            System.out.println("Codificação do arquivo: " + isr.getEncoding());
            
            int intValue;
			// lê o arquivo caractere a caractere e imprime na tela
			while((intValue = isr.read()) != -1) { 
				char ch = (char) intValue; 
				System.out.print(ch);
			}

			System.out.println(); 
		} 
		catch( IOException e ){
			System.out.println("ERRO: " + e.getMessage());
		}
	}
}
