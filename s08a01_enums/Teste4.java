class Teste {
    private int a;
    private int b;

    private Teste(int x, int y) {
        a = x;
        b = y;
    }

    public Teste() {
        this(3, 4);
    }

    public String toString() {
        Teste d = new Teste(5,6);
        return String.format("%d %d%n", a, b);
    }
}

public class Teste4 {
    public static void main(String[] args) {
        Teste t = new Teste();
        System.out.println(t.toString());
    }
}