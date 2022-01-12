import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as palavras: ");
        String line = sc.nextLine();

        // Construtor vazio (default)
        Set<String> set = new HashSet<>();

        sc = new Scanner(line);
        while(sc.hasNext()) 
            set.add(sc.next());

        System.out.println("Palavras, sem duplicatas: ");
        System.out.println(set);
    
    }
}