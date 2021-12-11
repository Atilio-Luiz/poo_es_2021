public class TesteStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ok");
        StringBuilder tb = new StringBuilder("Ok");

        // A classe StringBuilder não sobrescreve o
        // método hashCode da superclasse Object.
        // Logo, duas referências para StringBuilders 
        // possuem o mesmo hashcode se e somente se elas 
        // apontam para o mesmo objeto na memória
        System.out.println(sb.hashCode());
        System.out.println(tb.hashCode());

        // A classe StringBuilder não sobrescreve o
        // método equals da superclasse Object.
        // Logo, duas StringBulders são iguais se e 
        // somente se elas estão na mesma região da memória
        if(sb.equals(tb)) {
            System.out.println(sb + " == " + tb);
        } else {
            System.out.println(sb + " != " + tb);
        }
    }
}