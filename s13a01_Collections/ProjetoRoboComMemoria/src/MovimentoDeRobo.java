/**
 * A classe MovimentoDeRobo representa um único movimento de um robô
 * (que consiste em um número de passos dados em uma certa direção).
 * Esta classe será usada para permitir a instâncias da classe 
 * RoboComMemoria o armazenamento de cada movimento.
 */
public class MovimentoDeRobo {
    /**
     * Declaração dos campos da classe
     */
    private int passos; // o número de passos dados
    private short direcao; // a direção na qual os passos foram dados

    /**
     * Construtor
     * @param passos o número de passos
     * @param direcao a direção do robô
     */
    public MovimentoDeRobo(int passos, short direcao) {
        this.passos = passos;
        this.direcao = direcao;
    }

    @Override
    public String toString() {
        return passos + " passos na direção " + direcao;
    }

    /**
     * O método quantosPassos retorna o valor do campo passos
     * @return o valor do campo passos
     */
    public int quantosPassos() {
        return passos;
    }

    /**
     * O método qualDirecao retorna o valor do campo direcao
     * @return o valor do campo direcao
     */
    public short qualDirecao() {
        return direcao;
    }
}
