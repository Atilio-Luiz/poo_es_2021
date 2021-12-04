package ufc.quixada.datahora;

/**
 * A classe DataHora reutiliza as classes Data e Hora através
 * de composição. A data e hora são apresentadas por instâncias das 
 * respectivas classes que estão embutidas na classe DataHora. 
 * @see java.lang.Object
 * @see Data 
 * @see Hora
 * @author Atilio Gomes
 * @version 1.0
 */
public class DataHora {
    /**
     * Este atributo encapsula a data
     */
    private Data estaData;
    /**
     * Este atributo encapula a hora
     */
    private Hora estaHora;
    /**
     * Este atributo encapsula os nomes dos meses do ano como Strings
     */
    private static final String[] mes = 
        {"", "janeiro", "fevereiro", "março", "abril", "maio", "junho", 
        "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

    /**
     * O construtor para a classe DataHora, que recebe argumentos 
     * para inicializar todos os atributos que esta classe indiretamente 
     * contém, e chama os construtores das classes Data e Hora para 
     * inicializar os campos das instâncias dessas classes.
     * @see Data#Data(byte, byte, short)
     * @see Hora#Hora(byte, byte, byte)
     * @param h a hora
     * @param min o minuto
     * @param s o segundo
     * @param d o dia
     * @param m o mês
     * @param a o ano
     */
    public DataHora(byte h, byte min, byte s, byte d, byte m, short a) {
        estaData = new Data(d,m,a);
        estaHora = new Hora(h,min,s);
    }

    /**
     * O método toString não recebe argumentos, e retorna uma String
     * contendo os valores dos atributos dessa classe formatados.
     * @return uma string com os valores dos campos formatados
     */
    public String toString() {
        String resultado = "hora: " + estaHora + 
            ", dia: " + estaData.getDia() + 
            " de " + mes[estaData.getMes()] + 
            " de " + estaData.getAno();
        return resultado;
    }
} 
