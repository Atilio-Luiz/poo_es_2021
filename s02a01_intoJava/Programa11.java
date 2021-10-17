import java.util.Scanner;

public class Programa11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual eh o seu nome? ");
        String nome = input.nextLine();

        System.out.print("Quantos anos voce tem? ");
        int idade = input.nextInt();

        System.out.println("Ola, " + nome + 
            ". Proximo ano, voce tera " + 
            (idade + 1) + " anos");
        
        input.close(); // fecha o Scanner
    }
}