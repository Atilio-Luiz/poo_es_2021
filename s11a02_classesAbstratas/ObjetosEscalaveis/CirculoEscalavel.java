/**
 * A classe CirculoEscalavel implementa as interfaces ObjetoGeometrico e
 * Esclavel, e representa um círculo cujo tamanho pode ser modificado em
 * função de seu tamanho anterior.
 * Esta classe encapsula o ponto central do círculo e seu raio.
 * Todos os métodos declarados nas interfaces ObjetoGeometrico e
 * Escalavel são implementados.
 */
public class CirculoEscalavel implements ObjetoGeometrico, Escalavel {
    /**
     * Declaração dos campos da classe
     */
    private Ponto2D centro;
    private double raio;

    /**
     * Construtor "completo"
     * @param centro o centro do círculo (uma instância da classe Ponto2D)
     * @param raio o raio do círculo
     */
    public CirculoEscalavel(Ponto2D centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    /**
     * Este método centro retorna o ponto em duas dimensões 
     * representando o centro do círculo
     * @return uma instância da classe Ponto2D representando 
     * o centro do círculo
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
     * O método amplia modifica o raio do círculo de acordo com o
     * valor passado como argumento, efetivamente modificando o tamanho
     * do círculo
     * @param escala a escala para modificação do círculo
     */
    @Override
    public void amplia(double escala) {
        raio *= escala;
    }

    /**
     * O método espelha modifica o centro do círculo para alterar a sua posição
     * (fazendo com que o círculo fique refletido nas suas coordenadas horizontais)
     */
    @Override
    public void espelha() {
        centro = new Ponto2D(-centro.getX(), centro.getY());
    }

    /**
     * toString
     * @return uma string contendo uma representação dos campos do Círculo
     */
    @Override
    public String toString() {
        // o método toString da classe Ponto2D é chamado implicitamente
        return "Círculo com centro em " + centro + " e raio " + raio;
    }

}