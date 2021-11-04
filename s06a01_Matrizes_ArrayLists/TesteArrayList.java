import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> vec = new ArrayList<Integer>(20);

        vec.add(23); // boxing
        vec.add(24);
        vec.add(25);
        vec.add(0, 25); // 25, 23, 24, 25

        System.out.println(vec);
    }
}