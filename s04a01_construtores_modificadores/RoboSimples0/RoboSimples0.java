/**
 * A classe RoboSimples0 representa um robô que tem uma posição qualquer
 * no espaço de duas dimensões, pode modificar a posição e direção 
 * (se movimentar somente para a frente) e informar a sua posição e direção.
 * Este robô é um modelo supersimplificado de um pequeno robô móvel.
 * O nome da classe tem um zero pois esta classe ainda será modificada.
 */
class RoboSimples0 {
    /**
     * Declaração dos atributos da classe
     */
    private String nomeDoRobo;
    private int posicaoXAtual, posicaoYAtual;
    private char direcaoAtual; // pode ser norte(N), sul(S), leste(L) e oeste(O)

    /**
     * O construtor para a classe RoboSimples0, que recebe argumentos
     * para inicializar todos os campos da classe
     * @param n o nome do robô
     * @param px a posição X atual
     * @param py a posição Y atual
     * @param d a direção atual
     */
    RoboSimples0(String n, int px, int py, char d) {
        nomeDoRobo = n;
        posicaoXAtual = px;
        posicaoYAtual = py;
        direcaoAtual = d;
    }

    /**
     * O construtor para a classe RoboSimples0 que recebe o nome do robô
     * e assume que este robô está na posição (0,0) e direção norte.
     * @param n o nome do robô
     */
    RoboSimples0(String n) {
        nomeDoRobo = n;
        posicaoXAtual = 0;
        posicaoYAtual = 0;
        direcaoAtual = 'N';
    }

    /**
     * O construtor para a classe RoboSimples0 que não recebe argumento e 
     * assume que o robô não tem nome e que este robô está na posição (0,0) e direção norte.
     */
    RoboSimples0() {
        nomeDoRobo = "";
        posicaoXAtual = 0;
        posicaoYAtual = 0;
        direcaoAtual = 'N';
    }

    /**
     * Esta versão do método move modifica a posição do robô em uma unidade
     * a direção em que o robô está. 
     */
    public void move() {
        if(direcaoAtual == 'N') posicaoYAtual++;
        if(direcaoAtual == 'S') posicaoYAtual--;
        if(direcaoAtual == 'L') posicaoXAtual++;
        if(direcaoAtual == 'O') posicaoXAtual--;
    }

    /**
     * Esta versão do método move modifica a posição do robô em 
     * um certo número de unidades na direção em que o robô está.
     * @param passos o número de "passos" para o robô
     */
    public void move(int passos) {
        if(direcaoAtual == 'N') posicaoYAtual += passos;
        if(direcaoAtual == 'S') posicaoYAtual -= passos;
        if(direcaoAtual == 'L') posicaoXAtual += passos;
        if(direcaoAtual == 'O') posicaoXAtual -= passos;
    }

    /**
     * O método mudaDirecao permite que a direção do robô seja mudada
     * depois de ele ter sido criado.
     * @param novaDirecao a nova direção para o robô
     */
    public void mudaDirecao(char novaDirecao) {
        direcaoAtual = novaDirecao;
    }

    /**
     * O método toString retorna uma string contendo os valores dos
     * atributos da classe formatados.
     * @return uma string com os valores dos atributos formatados
     */
    public String toString() {
        String posicao = "Nome do robô: " + nomeDoRobo + "\n";
        posicao += "Posição do robô: (" + posicaoXAtual + "," +
                                          posicaoYAtual + ")\n";
        posicao += "Direção do robô: " + direcaoAtual;
        return posicao;
    }
}