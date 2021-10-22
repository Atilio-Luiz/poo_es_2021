/**
 * A classe Data contém campos e metodos que permitem 
 * a manipulacao de datas. Esta versão da classe tem 
 * os campos protegidos para evitar a sua manipulação 
 * incorreta -- valores dos campos só podem ser 
 * acessados através de métodos.
 */
public class Data { // declaração da classe

    /**
     * Declaração dos atributos da classe
     */
    private byte dia, mes; 
    private short ano;

    /**
     * O construtor recebe argumentos para inicializar 
     * os atributos do objeto do tipo Data. Esse construtor chama o método 
     * dataEhValida para verificar se os argumentos correspondem
     * a uma data válida: se forem, inicializa os atributos, caso 
     * contrário inicializa todos os três atributos com o valor zero.
     * @param d o argumento correspondente ao atributo dia
     * @param m o argumento correspondente ao atributo mes
     * @param a o argumento correspondente ao atributo ano
     */
    Data(byte d, byte m, short a) {
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
     * O método dataEhValida recebe três valores como argumentos
     * e verifica de maneira simples se os dados correspondem a 
     * uma data válida. Se a data for válida, retorna a constante 
     * booleana true, caso contrário, retorna false.
     * Vale a pena notar que este algoritmo é simples e incorreto, 
     * uma tarefa para casa consiste em pesquisar e escrever o 
     * algoritmo correto.
     * @param d o argumento correspondente ao atributo dia
     * @param m o argumento correspondente ao atributo mes
     * @param a o argumento correspondente ao atributo ano
     * @return true se a data for válida, false caso contrário
     */
    public boolean dataEhValida(byte d, byte m, short a) {
        if(d >= 1 && d <= 31 && m >= 1 && m <= 12)
            return true;
        else 
            return false;
    }

    /**
     * O método getDia devolve o dia da data encapsulada.
     * @return o dia encapsulado pela classe
     */
    public byte getDia() {
        return dia;
    }

    /**
     * O método getMes devolve o mês da data encapsulada.
     * @return o mês encapsulado pela classe
     */
    public byte getMes() {
        return mes;
    }

    /**
     * O método getAno devolve o ano da data encapsulada.
     * @return o ano encapsulado pela classe
     */
    public short getAno() {
        return ano;
    }

    /**
     * O método ehIgual recebe uma instância da própria classe
     * Data como argumento e verifica se a data representada 
     * pela classe e pela instância que foi passada é a mesma.
     * A comparação é feita comparando os campos da data um a um.
     * @param data uma instância da própria classe Data
     * @return true se a data encapsulada for igual à passada, false caso contrário
     */
    public boolean ehIgual(Data data) {
        if( (dia == data.dia) && (mes == data.mes) && (ano == data.ano) )
            return true;
        else
            return false;
    }

    /**
     * O método toString sobrescrito.
     * @return uma String contendo a data no formato dd/mm/aaaa.
     */
    public String toString() {
        String dataFormatada = String.format("%02d/%02d/%04d", dia, mes, ano);
        return dataFormatada;
    }
}