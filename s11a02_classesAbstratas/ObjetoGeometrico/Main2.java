import objetos.ObjetoGeometrico;
import objetos.Ponto2D;
import objetos.Retangulo;
import objetos.Circulo;

/**
 * Esta classe demonstra características de polimorfismo
 * com interfaces e classes que as implementam.
 */
public class Main2 {

    public static void main(String[] args) {
        // Declaramos algumas referências à interface ObjetoGeometrico
        ObjetoGeometrico o1, o2;

        // Criamos as instâncias das classes Circulo e Retangulo e as
        // associamos às referências à interface ObjetoGeometrico.
        // Note que o cast não é necessário, já que um Circulo (ou Retangulo) é
        // um tipo de ObjetoGeometrico
        o1 = new Circulo(new Ponto2D(0,0), 20);
        o2 = new Retangulo(new Ponto2D(-1,-1), new Ponto2D(1,1));


        // Vamos ver que referência é instância de que classe
        System.out.println("o1 é um Circulo? "+
                (o1 instanceof Circulo)); // true
        System.out.println("o1 é um Retangulo? "+
                (o1 instanceof Retangulo)); // false
        System.out.println("o1 é um ObjetoGeometrico? "+
                (o1 instanceof ObjetoGeometrico)); // true
        System.out.println("o2 é um Circulo? "+
                (o2 instanceof Circulo)); // false
        System.out.println("o2 é um Retangulo? "+
                (o2 instanceof Retangulo)); // true
        System.out.println("o2 é um ObjetoGeometrico? "+
                (o2 instanceof ObjetoGeometrico)); // true
    }
}
