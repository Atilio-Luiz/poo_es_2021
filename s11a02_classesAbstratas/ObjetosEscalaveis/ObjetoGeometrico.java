/**
 * A interface ObjetoGeometrico define que métodos um objeto geométrico
 * genérico bidimensional deve conter. Esta interface não declara nenhum campo.
 */
public interface ObjetoGeometrico {
    /**
     * O método centro retorna o ponto em duas dimensões que corresponde
     * ao centro do objeto geométrico
     * @return uma instância da classe Ponto2D representando o centro do objeto geométrico.
     */
    public Ponto2D centro();

    /**
     * Esse método calcula a área do objeto geométrico e retorna a área
     * como um valor do tipo double
     * @return a área deste objeto geométrico
     */
    public double calculaArea();

    /**
     * Esse método calcula o perímetro do objeto geométrico e retorna o perímetro
     * como um valor do tipo double
     * @return o perímetro deste objeto geométrico
     */
    public double calculaPerimetro();
}
