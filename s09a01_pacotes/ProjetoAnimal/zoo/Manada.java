package zoo;

import java.util.ArrayList;

public class Manada {
    public static void main(String[] args) {
        ArrayList<Girafa> manadaDeGirafas = new ArrayList<>();

        manadaDeGirafas.add(new Girafa("lili")); // ok
        manadaDeGirafas.add(new Girafa("beta")); // ok
        manadaDeGirafas.add(new Girafa("toni")); // ok

        for(Girafa g : manadaDeGirafas)
            System.out.println(g);
    }
}
