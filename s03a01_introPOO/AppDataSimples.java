import java.util.Scanner;

public class AppDataSimples {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DataSimples hoje = new DataSimples();
        DataSimples independenciaDoBrasil = new DataSimples();
        byte dia, mes;
        short ano;

        System.out.print("Digite a data de hoje separada por espaços: ");
        dia = sc.nextByte();
        mes = sc.nextByte();
        ano = sc.nextShort();

        hoje.inicializaDataSimples(dia, mes, ano);
        System.out.print("Data de hoje: ");
        hoje.mostraData();

        // Os literais 22, 4 e 1500 são considerados int pelo 
        // compilador e, no caso de passagem de argumentos 
        // para métodos, o Java exige que eles sejam 
        // convertidos explicitamente para byte/short 
        independenciaDoBrasil.inicializaDataSimples((byte)22, (byte)4, (short)1500);
        System.out.print("Dia da independência do Brasil: ");
        independenciaDoBrasil.mostraData();

        if(hoje.ehIgual(independenciaDoBrasil)) {
            System.out.println("Hoje é o dia da independência do Brasil.");
        }

        hoje.dia = 0;
        hoje.mes = 1;
        hoje.ano = 2001;
        hoje.mostraData(); // essa data é valida?
        independenciaDoBrasil.mes = 13;
        independenciaDoBrasil.mostraData();

        sc.close();
    }
}