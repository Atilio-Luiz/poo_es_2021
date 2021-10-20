import java.util.Scanner;

public class AppData {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Data nascimento = new Data();
        Data descobrimentoDoBrasil = new Data();
        byte dia, mes;
        short ano;

        System.out.print("Digite sua data de nascimento: ");
        dia = sc.nextByte();
        mes = sc.nextByte();
        ano = sc.nextShort();

        nascimento.inicializaData(dia, mes, ano);
        System.out.print("Dia do seu nascimento: ");
        nascimento.mostraData();

        // Os literais 22, 4 e 1500 são considerados int pelo compilador
        // e, no caso de passagem de argumentos para métodos, o Java
        // exige que eles sejam convertidos explicitamente para byte/short 
        descobrimentoDoBrasil.inicializaData((byte)22, (byte)4, (short)1500);
        System.out.print("Dia do descobrimento do Brasil: ");
        descobrimentoDoBrasil.mostraData();

        if(nascimento.ehIgual(descobrimentoDoBrasil)) {
            System.out.println("Você nasceu no dia do descobrimento do Brasil.");
        }

        sc.close();
    }
}
