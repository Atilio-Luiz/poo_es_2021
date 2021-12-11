package objetos;

/**
 * A classe Ponto2D encapsula um ponto no espaço cartesiano de duas dimensões
 */
public class Ponto2D {
    private double x, y;

    /**
     * Construtor com dois argumentos
     * @param x a coordenada X do ponto
     * @param y a coordenada Y do ponto
     */
    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * getter
     * @return coordenada x
     */
    public double getX() {
        return x;
    }

    /**
     * getter
     * @return coordenada y
     */
    public double getY() {
        return y;
    }

    /**
     * Método toString
     * @return uma string com a representação formatada do ponto
     */
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
