import java.util.ArrayList;
import java.util.Collections;

public class App3 {
    public static void main(String[] args) {
        ArrayList<Pessoa> al = new ArrayList<Pessoa>(4);
        al.add(new Pessoa(4,"Carlos"));
        al.add(new Pessoa(3,"Tábata"));
        al.add(new Pessoa(1,"Lúcia"));
        al.add(new Pessoa(2,"João"));

        System.out.println(al); // imprime ArrayList

        Collections.sort(al, new NomeComparator()); // ordena ArrayList

        System.out.println("Ordenado por nome: ");
        System.out.println(al); // imprime ArrayList ordenado

        Collections.sort(al); // ordenar pelo id

        System.out.println("Ordenado por id: ");
        System.out.println(al); // imprime ArrayList ordenado
    }
}
