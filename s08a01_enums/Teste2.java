class Color {
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
}

public class Teste2 {
    public static void main(String[] args) {
        Color c = Color.RED;
        Color d = Color.RED;
        if(c == d) {
            System.out.println("c e d apontam pro mesmo objeto");
        }
        if(c.equals(d)) {
            System.out.println("c e d são iguais");
        }
        System.out.println(c.toString());
    }
}