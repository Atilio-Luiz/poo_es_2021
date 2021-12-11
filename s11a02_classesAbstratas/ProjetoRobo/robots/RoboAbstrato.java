package robots;

/**
 * A classe abstrata RoboAbstrato define que métodos e campos mínimos
 * uma classe que implementa um robô deve conter. Esta classe é declarada
 * como sendo abstrata, assim não pode ser instanciada diretamente.
 * Alguns de seus métodos têm corpo, podendo ser herdados diretamente por
 * outra classe, ou sobrepostos. Os métodos que são declarados como sendo
 * abstratos não têm corpo, e devem obrigatoriamente ser implementados
 * pelas classes herdeiras (a não ser que as classes herdeiras sejam
 * também abstratas.)
 */
public abstract class RoboAbstrato {
    /**
     * Declaração dos campos da classe
     */
    private String nomeDoRobo;
    private int posicaoXAtual;
    private int posicaoYAtual;
    private short direcaoAtual; // consideramos que são valores em graus

    /**
     * O construtor para a classe RoboAbstrato
     * @param nome o nome do robô
     * @param px a posição X atual
     * @param py a posição Y atual
     * @param direcao a direção atual
     */
    public RoboAbstrato(String nome, int px, int py, short direcao) {
        nomeDoRobo = nome;
        posicaoXAtual = px;
        posicaoYAtual = py;
        direcaoAtual = direcao;
    }

    /**
     * Esta versão do método move modifica a posição do robô em um número
     * de unidades na direção em que o robô está. O método é declarado como
     * abstrato e não tem corpo, pois não sabemos exatamente como um robô
     * (instância de classe que herda desta) irá implementar seus movimentos.
     * @param passos o número de "passos" para o robô
     */
    public abstract void move (int passos);


    /**
     * Esta versão do método move modifica a posição do robô em uma unidade
     * na direção em que o robô está. Este método não recebe argumentos, e
     * chama o método move com argumentos.
     */
    public void move() {
        move(1);
    }


    /**
     * Este método permite a modificação do campo posicaoXAtual, já que o método
     * move foi declarado como abstrato e não existe outra maneira de modificar
     * a posição do robô.
     * @param passos o número de passos que serão usados para modificar 
     * a posição X (horizontal) atual do robô
     */
    public void moveX(int passos) {
        posicaoXAtual += passos;
    }

    /**
     * Este método permite a modificação do campo posicaoYAtual, já que o método
     * move foi declarado como abstrato e não existe outra maneira de modificar
     * a posição do robô.
     * @param passos o número de passos que serão usados para modificar 
     * a posição Y (vertical) atual do robô
     */
    public void moveY(int passos) {
        posicaoYAtual += passos;
    }

    /**
     * Permite que a direção do robô seja mudada depois de ele ter sido criado.
     * @param novaDirecao a nova direção para o robô
     */
    public void mudaDirecao(short novaDirecao) {
        direcaoAtual = novaDirecao;
    }

    /**
     * Este método permite a verificação do valor do campo direcaoAtual, 
     * já que o mesmo foi declarado como sendo privado.
     * @return o valor do campo direcaoAtual
     */
    public short qualDirecaoAtual() {
        return direcaoAtual;
    }

    /**
     * O método toString
     * @return uma string com os valores dos campos formatados
     */
    @Override
    public String toString(){
        String resultado = "Nome do robô: "+nomeDoRobo+"\n";
        resultado += "Posição do robô: ("+posicaoXAtual+", "+posicaoYAtual+")\n";
        resultado += "Direção do robô: "+direcaoAtual;
        return resultado;
    }
}
