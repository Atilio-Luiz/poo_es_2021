public class StringMiscellaneous {
    public static void main(String[] args) {
        String s1 = "hello there";
        char[] charArray = new char[5];

        System.out.printf("s1: %s", s1);

        // testa o método length
        System.out.printf("%nLength of s1: %d", s1.length());

        System.out.printf("%nThe string reversed is: ");

        for(int count = s1.length()-1; count >= 0; count--) {
            System.out.printf("%c", s1.charAt(count));
        }

        // copia caracteres da string para o array
        s1.getChars(0, 5, charArray, 0);
        System.out.printf("%nThe character array is: ");

        for(char ch : charArray) {
            System.out.print(ch);
        }

        System.out.println();
    }
}