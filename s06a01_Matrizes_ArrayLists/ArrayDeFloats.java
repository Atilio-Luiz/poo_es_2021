/**
 * A classe ArrayDeFloats encapsula um array de valores de
 * ponto flutuante, com vários métodos que a tornam 
 * mais útil e versátil do que um array comum
 */
public class ArrayDeFloats {
    /**
     * Declaração dos atributos da classe
     */
    private float[] array;

    /**
     * O construtor para a classe ArrayDeFloats, que recebe um argumento que
     * será o número de posições que a instância da classe será capaz de armazenar
     * @param tamanho o número de posições para valores do tipo float a serem alocados
     */
    ArrayDeFloats(int tamanho) {
        array = new float[tamanho];
    }
    /**
     * O método tamanho retorna o tamanho do array encapsulado
     * @return o número de posições para valores do tipo float no array encapsulado
     */
    public int tamanho() {
        return array.length;
    }

    /**
     * O método posição recebe como argumentos uma posição e um valo, modificando no
     * array encapsulado o valor na posição especificada. O valor somente será modificado
     * se a posição for válida; caso contrário, o método não executará nenhum comando.
     * @param posicao a posição do array cujo valor será modificado
     * @param valor o valor que será armazenado na posição especificada
     */
    public void modifica(int posicao, float valor) {
        if(posicao >= 0 && posicao < array.length)
            array[posicao] = valor;
    }

    /**
     * O método valor retorna o valor armazenado em uma certa posição, que é passada
     * como argumento para o método. O valor armazenado somente será retornado se
     * a posição for válida. Caso uma posição não-válida seja passada, o método
     * retornará a constante Float.NaN, que representa um valor de ponto flutuante
     * que não é um número. 
     * @param posicao
     * @return
     */
    public float valor(int posicao) {
        if(posicao >= 0 && posicao < array.length)
            return array[posicao];
        else   
            return Float.NaN;
    }

    /**
     * O método paraArray retorna o array encapsulado como um array de floats.
     * Este método pode ser útil casos seja necessário usar o array "desencapsulado",
     * para, por exemplo, passá-lo como argumento para um método que somente aceita arrays.
     * ----> Cuidado, este método desobedece o pilar do encapsulamento
     * @return o array encapsulado por essa classe.
     */
    public float[] paraArray() {
        return array;
    }

    /**
     * O método menorValor retorna o menor valor presente no array encapsulado.
     * @return o menor valor presente no array encapsulado
     */
    public float menorValor() {
        float menor = array[0];
        for(int i = 1; i < array.length; i++)
            if(array[i] < menor)
                menor = array[i];
        return menor;
    }

    /**
     * O método maiorValor retorna o maior valor presente no array encapsulado.
     * @return o maior valor presente no array encapsulado
     */
    public float maiorValor() {
        float maior = array[0];
        for(int i = 1; i < array.length; i++)
            if(array[i] > maior)
                maior = array[i];
        return maior;
    }

    /**
     * O método toString retorna os valores do array encapsulado formatados em uma string
     * @return uma string contendo uma representação dos valores do array encapsulado.
     */
    public String toString() {
        String resultado = "ArrayDeFloats[ ";
        for(int i = 0; i < array.length; i++)
            resultado += array[i] + " ";
        resultado += "]";
        return resultado;
    }
}