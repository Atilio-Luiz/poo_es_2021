import java.util.List;
import java.util.Arrays;
import java.util.Collections; 

public class Reverse {
    public static void main(String[] args) {
        String[] nomes = {"Célia", "Alberto", "Paula", 
                          "Bruna", "Júlia", "Hugo"};
        
        // cria uma lista
        List<String> lista = Arrays.asList(nomes); 

        System.out.println("Lista original: " + lista);

        Collections.reverse(lista); // inverte a lista

        System.out.println("Lista invertida: " + lista);
    }
}