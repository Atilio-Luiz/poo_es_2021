import java.util.Scanner;

public class TesteStrings01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        if(s1 == s2) {
            System.out.println("s1 e s2 referenciam o mesmo objeto");
        }
        else {
            System.out.println("s1 e s2 referenciam objetos diferentes");
        }
        input.close();
    }
}