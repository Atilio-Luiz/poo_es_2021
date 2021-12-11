import java.util.Arrays;

public class App1 {
    public static void main(String[] args) {
        Pessoa v[] = new Pessoa[4];
        v[0] = new Pessoa(4,"Carlos");
        v[1] = new Pessoa(3,"Tábata");
        v[2] = new Pessoa(1,"Lúcia");
        v[3] = new Pessoa(2,"João");

        System.out.println(Arrays.toString(v)); // imprime array

        Arrays.sort(v); // ordena array

        System.out.println(Arrays.toString(v)); // imprime array ordenado
    }
}
