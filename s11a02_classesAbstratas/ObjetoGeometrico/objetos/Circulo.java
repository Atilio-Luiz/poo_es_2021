package objetos;

/**
 * A classe Circulo implementa a interface ObjetoGeometrico e 
 * representa um círculo. Esta classe encapsula o ponto central 
 * do círculo e seu raio. Todos os métodos declarados
 * na interface ObjetoGeometrico são implementados.
 */
public class Circulo implements ObjetoGeometrico {
    /**
     * Declaração dos campos da classe
     */
    private Ponto2D centro;
    private double raio;

    /**
     * Construtor com dois argumentos
     * @param centro o centro do círculo (uma instância da classe Ponto2D)
     * @param raio o raio do círculo
     */
    public Circulo(Ponto2D centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    /**
     * Este método retorna o ponto em duas dimensões representando o centro do círculo
     * @return uma instância da classe Ponto2D representando o centro do círculo
     */
    @Override
    public Ponto2D centro() {
        return centro;
    }

    /**
     * Retorna a área do círculo como um valor do tipo double
     * @return a área deste círculo
     */
    @Override
    public double calculaArea() {
        return Math.PI * raio * raio; // PI vezes o quadrado do raio
    }

    /**
     * Retorna o perímetro do círculo como um valor do tipo double
     * @return o perímetro deste círculo
     */
    @Override
    public double calculaPerimetro() {
        return 2.0 * Math.PI * raio; // 2 vezes PI vezes o raio
    }

    /**
     * toString
     * @return uma string contendo uma representação dos campos do Círculo
     */
    @Override
    public String toString() {
        // o método toString da classe Ponto2D é chamado implicitamente
        return "Círculo com centro em "+centro+" e raio "+raio;
    }

}
