package ufc.quixada.datahora;

/**
 * A classe Hora encapsula dos dados de uma hora qualquer
 * e que faz parte do pacote ufc.quixada.datahora
 * @see java.lang.Object
 * @author Atilio Gomes
 * @version 1.0
 */
public class Hora {
    /**
     * Esse campo encapsula a hora no intervalo 0-24
     */
    private byte hora;
    /**
     * Esse campo encapsula o minuto no intervalo 0-59
     */
    private byte minuto;
    /**
     * Esse campo encapsula o segundo no intervalo 0-59
     */
    private byte segundo;

    /**
     * O construtor da classe Hora, que recebe argumentos para inicializar
     * os atributos da classe. Note que o construtor é declarado como sendo 
     * público, caso contrário ele não poderá ser chamado de fora do pacote.
     * @param h a hora a ser encapsulada por uma instância dessa classe
     * @param m o minuto a ser encapsulado por uma instância dessa classe
     * @param s o segundo a ser encapsulado por uma instância dessa classe
     */
    public Hora(byte h, byte m, byte s) {
        setHora(h);
        setMinuto(m);
        setSegundo(s);
    }

    /**
     * Este método getter devolve a hora
     * @return a hora
     */
    public byte getHora() {
        return hora;
    }

    /**
     * Este método getter devolve o minuto
     * @return o minuto
     */
    public byte getMinuto() {
        return minuto;
    }

    /**
     * Este método getter devolve o segundo
     * @return o segundo
     */
    public byte getSegundo() {
        return segundo;
    }

    /**
     * Este método setter recebe como parâmetro a nova hora
     * e checa se o valor do argumento é válido. O valor da 
     * hora é válido se e somente se estiver no intervalo [0..23]
     * @param hora a hora a ser modificada
     * @throws IllegalArgumentException se o argumento for inválido.
     */
    public void setHora(byte hora) {
        // checa se a hora está dentro do intervalo
        if(hora < 0 || hora > 23) {
            throw new IllegalArgumentException("hora(" + 
                hora + ") deveria ser 0..23");
        }
        this.hora = hora;
    }

    /**
     * Este método setter recebe como parâmetro o novo minuto
     * e checa se o valor do argumento é válido. O valor do 
     * minuto é válido se e somente se estiver no intervalo [0..59]
     * @param minuto o minuto a ser modificado
     * @throws IllegalArgumentException se o argumento for inválido.
     */
    public void setMinuto(byte minuto) {
        // checa se os minutos estão dentro do intervalo
        if(minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("minuto(" + 
                minuto + ") deveria ser 0..59");
        }
        this.minuto = minuto;
    }

    /**
     * Este método setter recebe como parâmetro o novo segundo 
     * e checa se o valor do argumento é válido. O valor do 
     * segundo é válido se e somente se estiver no intervalo [0..59]
     * @param segundo o segundo a ser modificado
     * @throws IllegalArgumentException se o argumento for inválido.
     */
    public void setSegundo(byte segundo) {
        // checa se os segundos estão dentro do intervalo
        if(segundo < 0 || segundo > 59) {
            throw new IllegalArgumentException("segundo(" 
                + segundo + ") deveria ser 0..59");
        }
        this.segundo = segundo;
    }

    /**
     * O método toString, que retorna uma string contendo os campos
     * dessa classe formatados de forma adequada.
     * @return a hora no formato hh:mm:ss
     */
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
