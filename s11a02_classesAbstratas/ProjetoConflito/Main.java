/**
 * Esta classe testa as interfaces e classes criadas
 */
public class Main {

    public static void main(String[] args) {

        Mapa mapa1 = new Mapa("mapa do Brasil",
                2,"Mapa do Brasil de 2017");

        Mapa mapa2 = new MapaDeBiblioteca("Mapa da biblioteca",
                3,"Mapa de 1979");

        System.out.println(mapa1);
        System.out.println(mapa2);
    }
}
