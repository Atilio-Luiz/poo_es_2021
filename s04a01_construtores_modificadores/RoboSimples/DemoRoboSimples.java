/**
 * A classe DemoRoboSimples0 demonstra o uso de 
 * instâncias da classe RoboSimples0
 */
public class DemoRoboSimples {
    public static void main(String[] args) {
        RoboSimples bob = new RoboSimples("Bob", 10, 10, 'S');
        RoboSimples chico = new RoboSimples("Chico");
        RoboSimples semNome = new RoboSimples();
        
        // Movimentamos esses robôs
        bob.move(10);
        chico.mudaDirecao('E');
        chico.move(5);
        semNome.move();

        // Onde os robôs estão agora?
        System.out.println(bob);
        System.out.println(chico);
        System.err.println(semNome);
    }
}