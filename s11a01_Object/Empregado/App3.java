public class App3 {
    public static void main(String[] args) throws Exception {
        Empregado3 p = new Empregado3("Luiz", 2398.90, 2021, 3, 4);
        Empregado3 q = new Empregado3("Luiz", 2398.90, 2021, 7, 4);
        
        System.out.println(p);
        System.out.println(q);

        if((p.equals(q))) 
            System.out.println("são iguais");
        else
            System.out.println("são diferentes");
        
        Gerente3 g1 = new Gerente3("Luiz", 2398.90, 2021, 3, 4);
        Gerente3 g2 = new Gerente3("Luiz", 2398.90, 2021, 3, 4);

        g2.setBonus(300.0);

        if((g1.equals(g2))) 
            System.out.println("gerentes são iguais");
        else
            System.out.println("gerentes são diferentes");
    }
}
