import java.util.Objects;

public class TesteHashCode1 {
    public static void main(String[] args) {
        System.out.println(Objects.hash(23.4));
        System.out.println(Objects.hash(2));
    }
}