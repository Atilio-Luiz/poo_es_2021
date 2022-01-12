package robots;

/**
 * A classe RoboSimples herda da classe RoboAbstrato e representa
 * um robô de comportamento simples.
 * Esta classe herda todos os métodos não abstratos da classe RoboAbstrato,
 * exceto o construtor, que é redeclarado (mas aproveita o construtor da classe
 * ancestral). Esta classe também implementa o método move, que foi declarado
 * como abstrato na classe ancestral. A classe não tem nenhum campo adicional.
 */
public class RoboSimples extends RoboAbstrato {
    /**
     * O construtor simplesmente repassa os argumentos para o construtor
     * da classe ancestral.
     * @param n o nome do robô
     * @param px a posição X atual
     * @param py a posição Y atual
     * @param d a direção atual
     */
    public RoboSimples(String n, int px, int py, short d) {
        super(n, px, py, d);
    }

    /**
     * Esta versão do método move modifica a posição do robô em um número de
     * unidades na direção em que o robô está. O método foi declarado como
     * sendo abstrato na classe ancestral, e deve ser implementado nesta classe.
     * Consideramos que um robô simples pode se movimentar somente nas
     * quatro direções cardeias, ou seja, 0, 90, 180, 270 graus, correspondente
     * aos pontos cardeais E, N, O, S. Outros valores são ignorados.
     * Como não podemos modificar diretamente os campos que determinam a posição
     * atual do robô, usamos os métodos moveX e moveY, herdados da classe ancestral.
     * @param passos o número de "passos" para o robô
     */
    @Override
    public void move(int passos) {
        switch (qualDirecaoAtual()) {
            case   0: moveX(+passos); break;  // passos positivos na direção X
            case  90: moveY(+passos); break;  // passos positivos na direção Y
            case 180: moveX(-passos); break;  // passos negativos na direção X
            case 270: moveY(-passos); break;  // passos negativos na direção Y
        }
    }
}
