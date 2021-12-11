public class App4 {
    public static void main(String[] args) {
        Empregado4 p = new Empregado4("Zeca", 1200.0, 2021, 5, 1);
        Empregado4 q = new Empregado4("Zeca", 1200.0, 2021, 5, 1);
        System.out.println(p.hashCode());
        System.out.println(q.hashCode());
        
        if((p.equals(q))) 
            System.out.println("empregados são iguais");
        else
            System.out.println("empregados são diferentes");
        
        Gerente4 g = new Gerente4("Maria", 5000.0, 2020, 8, 1);
        Gerente4 h = new Gerente4("Maria", 5000.0, 2020, 8, 1);
        System.out.println(g.hashCode());
        System.out.println(h.hashCode());

        if((g.equals(h))) 
            System.out.println("gerentes são iguais");
        else
            System.out.println("gerentes são diferentes");
        
        if((p.equals(g))) 
            System.out.println("esses dois objetos são iguais");
        else
            System.out.println("esses dois objetos são diferentes");
            
    }
    
}
