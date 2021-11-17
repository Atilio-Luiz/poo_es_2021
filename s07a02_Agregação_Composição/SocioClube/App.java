public class App {
    public static void main(String[] args) throws Exception {
        Clube clube = new Clube();

        Socio s1 = new Socio("Pedro");
        Socio s2 = new Socio("César");
        clube.addSocio(s1);
        clube.addSocio(s2);
        clube.addSocio(new Socio("Benedito"));

        System.out.println("Número de socios do clube = " + clube.numeroDeSocios());
        System.out.printf("Sócios do clube atualmente: ");
        for(int i = 0; i < clube.numeroDeSocios(); i++) {
            System.out.printf("%s; ", clube.getSocio(i));
        }
        System.out.println();

        Socio socioRemovido = clube.removeSocio(1);
        System.out.printf("Sócio removido: %s%n", socioRemovido);

        System.out.printf("Sócios do clube atualmente: ");
        for(int i = 0; i < clube.numeroDeSocios(); i++) {
            System.out.printf("%s; ", clube.getSocio(i));
        }
        System.out.println();
    }
}
