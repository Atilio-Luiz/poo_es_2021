public class ComparandoStrings {
    public static void main(String[] args) {
        String s1 = new String("casa"); // s1 é uma cópia de "casa"
        String s2 = "casa";

        // testa a igualdade com ==
        if(s1 == "casa")  // falso, eles não são o mesmo objeto
            System.out.println("s1 é o mesmo objeto que \"casa\"");
        else 
            System.out.println("s1 é um objeto diferante de \"casa\"");

        // testa a igualdade com ==
        if(s2 == "casa")  // true, eles são o mesmo objeto
            System.out.println("s2 é o mesmo objeto que \"casa\"");
        else 
            System.out.println("s2 é um objeto diferante de \"casa\"");

    }
}