import java.io.InputStream;
import java.io.IOException;

public class Exemplo02 {
	public static void main (String[] args){ 

		// Usando try with resources
        // Lendo dados do teclado. O nosso conhecido System.in é um
        // objeto herdeiro de InputStream
		try(InputStream input = System.in) { 
			int intValue;

			// lê o arquivo byte-a-byte e converte cada byte para um char
			while((intValue = input.read()) != -1) { 
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
