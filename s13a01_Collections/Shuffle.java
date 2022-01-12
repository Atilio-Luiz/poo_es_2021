import java.util.List;
import java.util.Arrays;
import java.util.Collections; 

public class Shuffle {
    public static void main(String[] args) {
        Character[] letras = {'a','b','c','d','e','f','g',
                              'h','i','j','k','l','m','n'};
        
        // cria uma lista
        List<Character> lista = Arrays.asList(letras); 

        System.out.println("Lista original: " + lista);

        Collections.shuffle(lista); // embaralha

        System.out.println("Lista embaralhada: " + lista);
    }
}