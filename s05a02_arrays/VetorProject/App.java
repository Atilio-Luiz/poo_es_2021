import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Vetor v = new Vetor(5);
        Vetor q = new Vetor(5);

        System.out.println("Primeiro vetor:");
        while(true) {
            System.out.print("Digite um inteiro (ou \"exit\" para sair): ");
            String str = input.next();
            if(str.equals("exit")) {
                break;
            }
            v.add(Integer.parseInt(str)); // boxing
        }

        System.out.println("Segundo Vetor:");
        while(true) {
            System.out.print("Digite um inteiro (ou \"exit\" para sair): ");
            String str = input.next();
            if(str.equals("exit")) {
                break;
            }
            q.add(Integer.parseInt(str)); // boxing
        }

        System.out.println("vetor v: " + v); // vai chamar toString
        System.out.println("vetor q: " + q); // vai chamar toString

        System.out.println("Size de v: " + v.size());
        System.out.println("Size de q: " + q.size());
        System.out.println("Capacity de v: " + v.capacity());
        System.out.println("Capacity de q: " + q.capacity());

        if(v.equals(q)) {
            System.out.println("Os vetores são iguais");
        }
        else {
            System.out.println("Os vetores são diferentes");
        }        
    }
}
