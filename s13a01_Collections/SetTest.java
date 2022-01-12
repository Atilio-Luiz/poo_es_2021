import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class SetTest {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> words = new HashSet<>();
        File file = new File("alice.txt");

        Scanner in = new Scanner(file);
        
        while(in.hasNext()) {
            String word = in.next();
            words.add(word);
        }

        Iterator<String> it = words.iterator();
        for(int i = 1; i <= 20 && it.hasNext(); i++)
            System.out.println(it.next());
        System.out.println("...");
        System.out.println(words.size() + " distinct words.");

        in.close();
    }
}