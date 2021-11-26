import zoo.Girafa; // A classe Girafa é visível pois é pública
import zoo.Zebra;

public class App {
    public static void main(String[] args) throws Exception {
        Zebra zeze = new Zebra("zeze");
        System.out.println(zeze);
        
        //Girafa gigi = new Girafa("gigi"); // erro: não é possível instanciar
        //System.out.println(gigi);
    }
}
