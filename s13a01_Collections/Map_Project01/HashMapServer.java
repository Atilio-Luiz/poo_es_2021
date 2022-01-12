import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Classe que cria e permite a consulta a um
 * minidicionário de nomes de servidores e seus IPs
 */
public class HashMapServer {

    /**
     * Método main cria uma instância da classe HashMap e permite
     * a interação do usuário com este mapa.
     * @param args os argumentos que podem ser passados para o método
     *             via linha de comando.
     */
    public static void main(String[] args) {
        // Criamos uma instância de HashMap que emulará um dicionário
        Map<String, String> dicionario = new HashMap<>(); // unsafe map!!!

        // Colocamos neste dicionário vários pares nomes/IPs de servidores
        dicionario.put("java.sun.com","192.18.97.241");
        dicionario.put("www.sbc.org.br","143.54.83.4");
        dicionario.put("www.usp.br","143.107.253.62");
        dicionario.put("www.inpe.br","150.163.12.2");
        dicionario.put("www.fapesp.br","143.108.30.103");
        dicionario.put("www.ibta.com.br","200.219.192.212");

        while (true) {
            // Recebemos, do usuário, o nome do servidor
            System.out.print("Entre o nome do servidor ou ENTER para terminar: ");
            Scanner entrada = new Scanner(System.in);
            String nomeServidor = entrada.nextLine();
            if (nomeServidor.length() == 0) break; // foi entrado ENTER

            // Se a chave existe no dicionário, entramos o seu valor
            if (dicionario.containsKey(nomeServidor))
                System.out.println("O IP do servidor "+nomeServidor+
                        " é "+dicionario.get(nomeServidor)+" ");
            else
                System.out.println("Este dicionário não contém o IP" +
                        "do servidor "+nomeServidor+" ");
        }

    }
}
