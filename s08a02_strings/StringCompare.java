public class StringCompare {
    public static void main(String[] args) {
        String s1 = new String("hello"); // s1 é uma cópia de "hello"
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);

        // testa a igualdade
        if(s1.equals("hello")) {
            System.out.println("s1 é igual a \"hello\"");
        }
        else {
            System.out.println("s1 é diferente de \"hello\"");
        }

        // testa a igualdade com ==
        if(s1 == "hello") { // falso, eles não são o mesmo objeto
            System.out.println("s1 é o mesmo objeto que \"hello\"");
        }
        else {
            System.out.println("s1 é um objeto diferante de \"hello\"");
        }

        // test for equality (ignore case)
        if(s3.equalsIgnoreCase(s4)) {
            System.out.printf("%s == %s com case ignorado%n", s3, s4);
        }
        else {
            System.out.println("s3 é diferente de s4");
        }

        // test compareTo
        System.out.printf("%ns1.compareTo(s2) é %d", s1.compareTo(s2));
        System.out.printf("%ns2.compareTo(s1) é %d", s2.compareTo(s1));
        System.out.printf("%ns1.compareTo(s1) é %d", s1.compareTo(s1));
        System.out.printf("%ns3.compareTo(s4) é %d", s3.compareTo(s4));
        System.out.printf("%ns4.compareTo(s3) é %d%n%n", s4.compareTo(s3));
        
        // test regionMatches (case sensitive)
        if(s3.regionMatches(0, s4, 0, 5)) {
            System.out.println("Os primeiros cinco caracteres de s3 e s4 casam");
        }
        else {
            System.out.println("Os primeiros cinco caracteres de s3 e s4 não casam");
        }

        // text regionMatches (ignore case)
        if(s3.regionMatches(true, 0, s4, 0, 5)) {
            System.out.println("Os primeiros cinco caracteres de s3 e s4 casam, com case ignorado");
        }
        else {
            System.out.println("Os primeiros cinco caracteres de s3 e s4 não casam de jeito nenhum");
        }
        
    }
}