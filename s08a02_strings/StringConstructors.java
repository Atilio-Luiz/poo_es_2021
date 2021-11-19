public class StringConstructors {
    public static void main(String[] args) {
        char[] charArray = {'b','i','r','t','h',' ','d','a','y'};
        String s = new String("hello");

        String s1 = new String();
        String s2 = "hello";
        String s3 = new String(charArray);
        String s4 = new String(charArray, 6, 3);

        System.out.println("s1 = " + s1); // 
        System.out.println("s2 = " + s2); // hello
        System.out.println("s3 = " + s3); // birth day
        System.out.println("s4 = " + s4); // day

        if("hello" == s2) {
            System.out.println("hello == s2");
        }
        if("hello".equals(s2)) {
            System.out.println("s2 == hello com equals");
        }
    }
}