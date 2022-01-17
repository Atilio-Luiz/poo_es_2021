import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class TestaSaida01 {
	public static void main(String[] args) {

		String file = "/home/fox/Arquivos/arquivo02.txt";
		Scanner sc = new Scanner(System.in);
		
		// Abre um arquivo. Como o segundo parâmetro está setado
		// com true, se o arquivo já existir, então o texto será
		// inserido ao final do arquivo. Se ele fosse setado
		// para false, um novo arquivo em branco seria criado e 
		// qualquer conteúdo prévio seria apagado.
		try (
				OutputStream os = new FileOutputStream(file, true);
				OutputStreamWriter osw = new OutputStreamWriter(os);
				BufferedWriter bw = new BufferedWriter(osw);
			)
		{
			while(sc.hasNextLine()) {
				String line = sc.nextLine(); // lê uma linha do terminal
				bw.write(line); // Escreve no arquivo
				bw.newLine(); // adiciona caractere de quebra de linha
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}		

	}
}
