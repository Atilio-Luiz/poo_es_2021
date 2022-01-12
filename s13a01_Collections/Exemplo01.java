import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class Exemplo01 {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");

        // usa um iterador para mostrar o conteúdo do array
        System.out.println("Array original: " + lista);
        
        Iterator<String> it = lista.iterator();

        while(it.hasNext()) {
            if(it.next().equals("B"))
                it.remove();
        }

        System.out.println("Array modificado: " + lista);
    }
}