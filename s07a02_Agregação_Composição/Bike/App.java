public class App {
    public static void main(String[] args) throws Exception {
        Bicicleta b = new Bicicleta(new Roda(), new Roda(), new Quadro(), new Selim(), new Guidao());
        System.out.println(b);
    }
}
