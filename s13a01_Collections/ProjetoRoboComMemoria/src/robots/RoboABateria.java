package robots;

/**
 * A classe RoboABateria herda da classe RoboAbstrato e representa
 * um robô que consome energia com seus movimentos.
 * Esta classe herda todos os métodos não abstratos da classe RoboAbstrato,
 * exceto o construtor, que é redeclarado (mas aproveita o construtor da classe
 * ancestral). Esta classe também implementa o método move, que foi declarado
 * como abstrato na classe ancestral. A classe contém um campo adicional
 * para indicar quantos passos o robô ainda pode dar.
 */
public class RoboABateria extends RoboAbstrato {
    private long energia;

    /**
     * O construtor chama o construtor da classe ancestral repassando alguns
     * argumentos e inicializa um campo desta classe
     * @param n o nome do robô
     * @param px a posição X atual
     * @param py a posição Y atual
     * @param d a direção atual
     * @param e a energia inicial
     */
    public RoboABateria(String n, int px, int py, short d, long e) {
        super(n, px, py, d);
        energia = e;
    }

    /**
     * Esta versão do método move modifica a posição do robô em um número de
     * unidades na direção em que o robô está e deduz o número de passos
     * da energia que o robô tem, considerando que a cada passo dez unidades
     * de energia são gastas.
     * Consideramos que um robô a bateria pode se movimentar somente em oito
     * direções, em intervalos de 45 graus, ou seja, nas direções
     * 0, 45, 90, 135, 180, 225, 270 e 315 graus -- outros valores são ignorados.
     * O método não faz nada caso a energia do robô não seja suficiente para movê-lo.
     * @param passos o número de "passos" para o robô
     */
    public void move(int passos) {
        long energiaASerGasta = passos * 10; // quanta energia será
                                             // necessária para movimentar o robô?
        if (energiaASerGasta <= energia) {  // o robô tem energia para se movimentar?
            switch (qualDirecaoAtual()) {   // recuperamos a direção atual através deste método
                case   0: moveX(+passos);
                          break;
                case  45: moveX(+passos);
                          moveY(+passos);
                          break;
                case  90: moveY(+passos);
                          break;
                case 135: moveY(+passos);
                          moveX(-passos);
                          break;
                case 180: moveX(-passos);
                          break;
                case 225: moveX(-passos);
                          moveY(-passos);
                          break;
                case 270: moveY(-passos);
                          break;
                case 315: moveY(-passos);
                          moveX(+passos);
                          break;
            }
            energia -= energiaASerGasta;
        }
    }

    /**
     * O método toString chama o método toString da classe ancestral e
     * concatena ao resultado da chamada os campos exclusivos desta classe
     * @return uma string com os valores dos campos formatados
     */
    @Override
    public String toString(){
        String resultado = super.toString()+"\n";
        resultado += "Energia do robô: "+energia;
        return resultado;
    }

}
