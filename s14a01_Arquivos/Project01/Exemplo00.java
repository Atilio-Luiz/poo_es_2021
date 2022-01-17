import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exemplo00 {
    public static void main (String[] args){ 
		String file = "/home/fox/Arquivos/arquivo01.txt"; // caminho absoluto do arquivo

        InputStream input = null;

		try { 
            input = new FileInputStream(file);

            int intValue;
			// lê o arquivo byte-a-byte e converte cada byte para um char
			while((intValue = input.read()) != -1) { 
				char ch = (char) intValue; 
				System.out.print(ch);
			}

			System.out.println(); 
		} 
		catch( IOException e ){
			System.out.println(e.getMessage());
		}
        finally {
            try {
                if(input != null) {
                    input.close();
                }
            }
            catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
	}
}
