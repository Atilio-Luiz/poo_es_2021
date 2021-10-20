/**
 * A classe DemoRoboSimples0 demonstra o uso de 
 * instâncias da classe RoboSimples0
 */
public class DemoRoboSimples0 {
    public static void main(String[] args) {
        RoboSimples0 bob = new RoboSimples0("Bob", 10, 10, 'S');
        RoboSimples0 chico = new RoboSimples0("Chico");
        RoboSimples0 semNome = new RoboSimples0();
        
        // Movimentamos esses robôs
        bob.move(10);
        chico.mudaDirecao('L');
        chico.move(5);
        semNome.move();

        // Onde os robôs estão agora?
        System.out.println(bob);
        System.out.println(chico);
        System.err.println(semNome);

        System.out.println(bob);
    }
}