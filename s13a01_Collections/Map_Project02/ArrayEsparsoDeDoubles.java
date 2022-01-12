
import java.util.*;

/**
 * Classe que encapsula um array esparso de valores
 * de ponto flutuante (doubles), com vários métodos
 * que a tornam mais útil e versátil do que um array
 * comum. Em um array esparso somente os valores
 * diferentes de zero são armazenados.
 */
public class ArrayEsparsoDeDoubles {

    /** Declaração dos campos da classe */
    private Map<Long, Double> mapa; // O array encapsulado como um map

    /**
     * Construtor
     */
    ArrayEsparsoDeDoubles() {
        mapa = new HashMap<Long, Double>(); // criamos um mapa como um HashMap
    }

    /**
     * O método modifica recebe como argumentos uma posição e um
     * valor, modificando o valor naquela posição para o passado
     * como argumento. Nenhuma verificação é feita quanto à validade
     * do índice usado. O índice é considerado como sendo do tipo long.
     * @param indice
     * @param valor
     */
    public void modifica (long indice, double valor) {
        mapa.put(indice, valor); // adicionamos o par indice-valor no mapa
    }

    /**
     * O método valor retorna o valor armazenado em certa posição, que
     * é passada como argumento para o método. Este método considera
     * que valores no array esparso que não sejam explicitamente
     * declarados são implicitamente iguais a zero.
     * @param indice a posição do array cujo valor será retornado
     * @return o valor que estava armazenado na posição especificada
     */
    public double valor (long indice) {
        Long chave = indice; // AUTO-BOXING
        if (mapa.containsKey(chave)) { // Se esta chave existe no mapa 
            Double valor = mapa.get(chave); // recuperamos o valor
            return valor; // AUTO-UNBOXING
        }
        else return 0.0;
    }

    public String toString() {
        String resultado = "O array tem " + mapa.size() +
                " elementos explicitamente definidos:\n";
        Iterator<Long> i = mapa.keySet().iterator(); // recuperamos o iterador
                                                       // para as chaves
        while (i.hasNext()) {
            Long chave = i.next();
            Double valor = mapa.get(chave);
            resultado += "\t" + chave + "->" + valor + "\n";
        }

        return resultado;
    }
}
