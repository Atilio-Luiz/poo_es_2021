import objetos.ObjetoGeometrico;
import objetos.Ponto2D;
import objetos.Retangulo;
import objetos.Circulo;

/**
 * Esta classe demonstra instâncias de classes que implementam a
 * interface ObjetoGeometrico
 */
public class Main {
    public static void main(String[] args) {
        // Declaramos algumas instâncias das classes Circulo e Retangulo
        Circulo c1 = new Circulo(new Ponto2D(0,0), 100);
        Circulo c2 = new Circulo(new Ponto2D(-1,-1), 1);
        Circulo c3 = new Circulo(new Ponto2D(10,8),0);
        Retangulo r1 = new Retangulo(new Ponto2D(-2,-2), new Ponto2D(2,2));
        Retangulo r2 = new Retangulo(new Ponto2D(-100,-1), new Ponto2D(100,1));
        Retangulo r3 = new Retangulo(new Ponto2D(0,0), new Ponto2D(0,0));
        
        imprimeTodosOsDados(c1);
        imprimeTodosOsDados(c2);
        imprimeTodosOsDados(c3);
        imprimeTodosOsDados(r1);
        imprimeTodosOsDados(r2);
        imprimeTodosOsDados(r3);
        
        System.out.println(r3.status()); // para testar o método default da interface
        
    } // fim do método main

    /**
     * O método imprimeTodosOsDados imprime todos os dados de uma instância de uma
     * classe que implemente a interface ObjetoGeometrico.
     * @param og uma instância de qualquer classe que implemente a 
     * interface ObjetoGeometrico
     */
    public static void imprimeTodosOsDados(ObjetoGeometrico og) {
        // Primeiro imprimimos os dados padrão do objeto,
        // chamando o método toString implicitamente
        System.out.println(og);

        // Imprimimos a área e o perímetro do objeto geométrico
        // com chamadas diretas aos métodos das classes
        System.out.println("Perímetro: " + og.calculaPerimetro());
        System.out.println("Área: " + og.calculaArea());

        // Imprimimos uma linha em branco para
        // melhor vizualização dos resultados
        System.out.println();
    }
}
