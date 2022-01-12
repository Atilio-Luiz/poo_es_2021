import java.util.ArrayList;
import java.util.List;

import robots.RoboAbstrato;

/**
 * A classe RoboComMemoria herda da classe abstrata RoboAbstrato
 * e representa um robô que armazena os movimentos feitos. 
 * Esta classe possui internamente uma lista de passos que é
 * atualizada a cada movimento do robô, podendo ser usada para
 * analisar seu caminho e possibilitar o retorno do 
 * robô à "base" (a posição original do robô)
 */
public class RoboComMemoria extends RoboAbstrato {
    /**
     * Declaração dos campos da classe
     */
    private List<MovimentoDeRobo> movimentos;

    /**
     * O construtor para a classe RoboComMemoria recebe argumentos
     * para inicializar todos os campos da classe, e inicializa 
     * também uma instância de classe que implementa a interface List
     * para conter os movimentos do Robô
     * @param nome o nome do robô
     * @param px a posição X atual
     * @param py a posição Y atual
     * @param distancia a direção atual
     */
    RoboComMemoria(String nome, int px, int py, short distancia) {
        super(nome, px, py, distancia);
        movimentos = new ArrayList<>();
    }

    /**
     * O método move modifica a posição do robô em um número de
     * unidades na direção em que o robô está, e armazena o movimento dado
     * pelo robô na lsita de movimentos.
     * @param passos o número de "passos" para o robô
     */
    @Override
    public void move(int passos) {
        switch(qualDirecaoAtual()) {
            case 0  : moveY(passos);  break;
            case 90 : moveX(passos);  break;
            case 180: moveY(-passos); break;
            case 270: moveX(-passos); break;
        }
        // adicionamos o movimento à lista
        movimentos.add(new MovimentoDeRobo(passos, qualDirecaoAtual()));
    }

    /**
     * O método listaCaminho retorna o conteúdo da lista de movimentos
     * feitos pelo robô como uma string 
     * @return uma string contendo a lista de movimentos do robô
     */
    public String listaCaminho() {
        // Para melhor performance, usamos internamente um StringBuilder
        StringBuilder resultado = new StringBuilder();
        // percorremos a lista de passos
        for(int passo = 0; passo < movimentos.size(); passo++) {
            resultado.append(movimentos.get(passo));
            resultado.append("\n");
        }
        return resultado.toString();
    }

    public void retornaABase() {
        for(int passo = movimentos.size()-1; passo >= 0; passo--) {
            MovimentoDeRobo umMovimento = movimentos.get(passo);
            mudaDirecao(umMovimento.qualDirecao());
            move(-umMovimento.quantosPassos());
        }
    }
}
