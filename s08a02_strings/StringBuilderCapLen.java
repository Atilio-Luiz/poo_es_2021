public class StringBuilderCapLen {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Hello, how are you?");

        System.out.printf("buffer = %s%nlenght = %d%ncapacity = %d%n%n",
            buffer.toString(), buffer.length(), buffer.capacity());

        buffer.ensureCapacity(75);
        System.out.printf("New capacity = %d%n", buffer.capacity());
        System.out.printf("New string = %s%n%n", buffer.toString());

        buffer.setLength(10);
        System.out.printf("New length = %d%nbuffer = %s%n", 
            buffer.length(), buffer.toString());
    }
}