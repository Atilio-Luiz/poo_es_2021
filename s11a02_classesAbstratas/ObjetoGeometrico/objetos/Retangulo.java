package objetos;

/**
 * A classe Retangulo implementa a interface ObjetoGeometrico 
 * e representa um retêngulo. Esta classe encapsula os dois 
 * pontos extremos do retângulo. Todos os métodos declarados
 * na interface ObjetoGeometrico são implementados.
 */
public class Retangulo implements ObjetoGeometrico {
    /**
     * Declaração dos campos da classe
     */
    private Ponto2D primeiroCanto, segundoCanto;

    /**
     * Construtor completo para a classe Retangulo
     * @param pc o primeiro canto do retângulo
     * @param sc o segundo canto do retângulo
     */
    public Retangulo(Ponto2D pc, Ponto2D sc) {
        primeiroCanto = pc;
        segundoCanto = sc;
    }

    /**
     * Este método retorna o ponto em duas dimensões representando o centro do retângulo
     * @return uma instância da classe Ponto2D representando o centro do retângulo
     */
    @Override
    public Ponto2D centro() {
        double coordX = (primeiroCanto.getX()+segundoCanto.getX())/2;
        double coordY = (primeiroCanto.getY()+segundoCanto.getY())/2;
        return new Ponto2D(coordX, coordY);
    }

    /**
     * Retorna a área do retângulo como um valor do tipo double
     * @return a área deste retângulo
     */
    @Override
    public double calculaArea() {
        // O método Math.abs garante que o valor será positivo
        double ladoX = Math.abs(primeiroCanto.getX()-segundoCanto.getX());
        double ladoY = Math.abs(primeiroCanto.getY()-segundoCanto.getY());
        return ladoX * ladoY;
    }

    /**
     * Retorna o perímetro do retângulo como um valor do tipo double
     * @return o perímetro deste retângulo
     */
    @Override
    public double calculaPerimetro() {
        // O método Math.abs garante que o valor será positivo
        double ladoX = Math.abs(primeiroCanto.getX()-segundoCanto.getX());
        double ladoY = Math.abs(primeiroCanto.getY()-segundoCanto.getY());
        return (2 * ladoX) + (2 * ladoY);
    }

    /**
     * Método toString retorna diretamente uma string criada com os valores dos campos.
     * O método toString da classe Ponto2D é chamado implicitamente
     * @return uma string com os valores dos campos formatados
     */
    @Override
    public String toString() {
        return "Retângulo com cantos "+primeiroCanto+" e "+segundoCanto;
    }
}
