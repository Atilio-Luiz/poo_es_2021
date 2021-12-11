import robots.RoboSimples;
import robots.RoboABateria;

/**
 * Esta classe demonstra instâncias das classes RoboSimples e RoboABateria
 * ESTA CLASSE NÃO PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS
 */
public class Main {
    public static void main(String[] args) {
        // Criamos e manipulamos um robô que é uma instância da classe RoboSimples
        RoboSimples exp = new RoboSimples("Explorer", 0, 0, (short)90);
        exp.move(10);
        exp.mudaDirecao((short)180);
        exp.move();
        exp.move();
        System.out.println(exp);

        System.out.println(); // imprime uma linha em branco para facilitar vizualização

        // Criamos e manipulamos um robô que é uma instância da classe RoboABateria
        RoboABateria walk = new RoboABateria("Walker", 0, 0, (short)90, 111);
        walk.move(10);
        walk.mudaDirecao((short)180);
        walk.move();
        walk.move();
        System.out.println(walk);

        /**
         * Tentamos criar uma instância da classe RoboAbstrato,
         * o que causará um erro de compilação
         */
        //RoboAbstrato imag = new RoboAbstrato("Imaginário", 0, 0, (short)180);
    }
}
