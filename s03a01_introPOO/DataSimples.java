/**
 * A classe DataSimples contém campos e metodos que
 * permitem a manipulacao de datas
 */
class DataSimples { // declaracao da classe

    byte dia, mes; // atributos ou campos
    short ano;

    /**
     * O metodo inicializaDataSimples recebe argumentos
     * para inicializar os campos da classe DataSimples.
     * @param d o argumento correspondente ao campo dia
     * @param m o argumento correspondente ao campo mes
     * @param a o argumento correspondente ao campo ano
     */
    void inicializaDataSimples(byte d, byte m, short a) {
        if(dataEhValida(d,m,a)) {
            dia = d;
            mes = m;
            ano = a;
        }
        else {
            dia = mes = 0;
            ano = 0;
        }
    }

    /**
     * O metodo dataEhValida recebe tres valores como argumentos
     * e verifica de maneira simples se os dados 
     * correspondem a uma data valida.
     * Vale a pena notar que este algoritmo eh simples e 
     * incorreto.
     * @param d o argumento correspondente ao campo dia
     * @param m o argumento correspondente ao campo mes
     * @param a o argumento correspondente ao campo ano
     * @return true se a data for valida, false caso contrario
     */
    boolean dataEhValida(byte d, byte m, short a) {
        if(d >= 1 && d <= 31 && m >= 1 && m <= 12)
            return true;
        else 
            return false;
    }

    /**
     * O metodo ehIgual recebe uma instancia da propria classe
     * DataSimples como argumento e verifica se a data 
     * representada pela classe e pela intancia que foi 
     * passada eh a mesma.
     * @param data uma instancia da propria classe DataSimples
     * @return true se a data encapsulada for igual a passada, false caso contrario
     */
    boolean ehIgual(DataSimples data) {
        if( (dia == data.dia) && (mes == data.mes) && 
            (ano == data.ano) )
            return true;
        else
            return false;
    }

    /**
     * O metodo mostraData imprime a data na tela
     */
    void mostraData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}