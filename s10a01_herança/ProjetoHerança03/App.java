import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Ponto2D p = new Ponto2D(2.0, 3.0);
        System.out.println(p);

        Ponto3D q = new Ponto3D(7.0, 5.0, 3.0);
        System.out.println(q);
    }
}
