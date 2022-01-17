import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

// Programa que escreve uma linha em arquivo texto.
class TestaSaida02 {
	public static void main(String[] args) throws IOException {
		/**
		 * FileOutputStream pode receber um booleano como segundo parâmetro
		 * indicando se você quer reescrever o arquivo (false), ou manter o 
		 * que já estava escrito (true)
		 */
		OutputStream os = new FileOutputStream("saida.txt", false);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Digite linhas que serão escritas em um arquivo chamado saida.txt.\n(Para finalizar, tecle CTRL+D)\n");
		
		//String s = br.readLine();
		String s = null;
		
		while ((s = br.readLine()) != null) {
			/**
			 * O método write escreve a String s no arquivo.
			 * Esse método não insere os caracteres de quebra de linha, 
			 * para isso use o método newLine.
			 */
			bw.write(s); // Escreve no arquivo
			//bw.append(s); // Também pode ser usado para escrever no arquivo
			bw.newLine(); // Adiciona o caractere de quebra de linha
			//s = br.readLine();
		}
		
		bw.close();
		br.close();
	}
}
