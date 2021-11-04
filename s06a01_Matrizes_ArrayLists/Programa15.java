public class Programa15 {
    public static void main(String[] args) {
        int[] array = {87, 78, 90, 45, 23, 17, 67};
        int total = 0;

        for(int number : array) {
            total += number;
        }

        System.out.printf("Total: %d%n", total);
    }
}