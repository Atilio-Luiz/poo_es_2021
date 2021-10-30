public class WrapperUnboxing {
    public static void main(String[] args) {
        Integer myInt = -4567; // boxing

        int x = myInt; // unboxing 

        System.out.println("Absolute value of " + myInt.toString() + " = " + absoluteValue(x));
    }

    public static int absoluteValue(int i) {
        return (i < 0) ? -i : i;
    }
}