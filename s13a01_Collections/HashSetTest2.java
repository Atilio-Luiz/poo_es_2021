import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as palavras: ");
        String line = sc.nextLine();

        String[] a = line.split(" ");

        // usando um dos construtores sobrecarregados
        Set<String> set = new HashSet<>(Arrays.asList(a));

        System.out.println("Palavras, sem duplicatas: ");
        System.out.println(set);
    }
}