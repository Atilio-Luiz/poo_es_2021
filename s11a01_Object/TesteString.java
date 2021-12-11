public class TesteString {
    public static void main(String[] args) {
        String s = "Ok";
        String t = new String("Ok");

        // No Java, duas Strings possuem o mesmo hashcode se
        // e somente se elas possuem o mesmo conteúdo
        System.out.println(s.hashCode());
        System.out.println(t.hashCode());

        // No Java, duas Strings são iguais se e somente se
        // elas possuem o mesmo conteúdo
        if(s.equals(t)) {
            System.out.println(s + " == " + t);
        } else {
            System.out.println(s + " != " + t);
        }
    }
}