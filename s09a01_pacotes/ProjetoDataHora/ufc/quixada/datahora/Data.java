package ufc.quixada.datahora;

/**
 * A classe Data encapsula os dados de uma data qualquer e
 * faz parte do pacote ufc.quixada.datahora
 * @see java.lang.Object
 * @author Atilio Gomes
 * @version 1.0 data: 25/11/2021
 */
public class Data {
    /**
     * Esse campo encapsula o dia
     */
    private byte dia;
    /**
     * Esse campo encapsula o mês
     */
    private byte mes;
    /**
     * Esse campo encapsula o ano
     */
    private short ano;
    /**
     * Esse campo encapsula os dias de cada mês do ano
     */
    private static final int[] diasPorMes = 
        {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /**
     * O Construtor da classe, que recebe argumentos para inicializar os
     * atributos da classe. Note que o construtor é declarado como sendo 
     * público, caso contrário ele não poderá ser chamado de fora do pacote.
     * @param dia o dia a ser encapsulado por uma instância dessa classe
     * @param mes o mês a ser encapsulado por uma instância dessa classe
     * @param ano o ano a ser encapsulado por uma instância dessa classe
     * @throws IllegalArgumentException no caso de uma data inválida
     */
    public Data(byte dia, byte mes, short ano) {
        // checa se o mês está dentro do intervalo
        if(mes < 1 || mes > 12) {
            throw new IllegalArgumentException("mês(" + mes + ") deveria ser 1-12");
        }

        // checa se o dia está dentro do intervalo esperado para o mês
        if(dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29))) {
            throw new IllegalArgumentException("dia(" + dia + ") fora do intervalo");
        }

        // checa se o ano é bissexto no caso do dia ser 29 e o mês ser 2
        if(mes == 2 && dia == 29 && !(ano % 400 == 0 ||
            (ano % 4 == 0 && ano % 100 != 0))) {
                throw new IllegalArgumentException("dia(" + dia + ") fora do intervalo");
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /**
     * Método getter que devolve o dia da data
     * @return o dia
     */
    public byte getDia() {
        return dia;
    }

    /**
     * Método getter que devolve o mês da data
     * @return o mês
     */
    public byte getMes() {
        return mes;
    }

    /**
     * Método getter que devolve o ano da data
     * @return o ano
     */
    public short getAno() {
        return ano;
    }

    /**
     * Método toString, que retorna um objeto String contendo a 
     * data no formato dd/mm/aaaa
     * @return a data no formato dd/mm/aaaa
     */
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}