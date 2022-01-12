import java.util.List;
import java.util.Arrays;
import java.util.Collections; 

public class Sort2 {
    public static void main(String[] args) {
        String[] nomes = {"Célia", "Alberto", "Paula", 
                          "Bruna", "Júlia", "Hugo"};
        
        // cria uma lista
        List<String> lista = Arrays.asList(nomes); 

        System.out.println("Lista original: " + lista);

        Collections.sort(lista, Collections.reverseOrder());
        System.out.print("Lista em ordem decrescente: ");
        System.out.println(lista);
    }
}