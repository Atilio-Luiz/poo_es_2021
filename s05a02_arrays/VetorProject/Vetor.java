/**
 * Classe que encapula um array que aumenta de tamanho
 * @author Atilio Luiz
 * @version 1.0, alterada em 29/10/2021
 */
public class Vetor {
    /**
     * Declaração dos atributos
     */
    private Integer[] array; // a referência para o array de Integer
    private int size; // número de elementos atualmente no Vetor
    private int capacity; // tamanho total do array

    /**
     * Construtor, recebe como parâmetro o tamanho inicial do vetor.
     * @param n capacidade inicial do Vetor
     */
    public Vetor(int n) {
        capacity = n;
        size = 0;
        array = new Integer[n];
    }

    /**
     * O método add recebe como parâmetro um Integer e o coloca 
     * na próxima posição disponı́vel do vetor; note que o vetor 
     * cresce automaticamente, portanto, se a inserção ultrapassar 
     * o tamanho inicial estabelecido na criação, por exemplo, 
     * o vetor deve aumentar seu tamanho automaticamente.
     * @param i o Integer a ser adicionao ao final do Vetor
     */
    public void add(Integer i) {
        if(size == capacity) {
            capacity = capacity * 2;
            Integer[] aux = new Integer[capacity];
            for(int j = 0; j < size; j++) {
                aux[j] = array[j];
            }
            array = aux;
        }
        array[size] = i;
        size++;
    }

    /**
     * O método get recebe como parâmetro uma posição do vetor 
     * e retorna o Integer que estiver naquela posição; se a 
     * posição não estiver ocupada ou ultrapassar o tamanho do 
     * vetor, este método retorna nulo.
     * @param i a posição do vetor
     * @return o Integer na posição i, ou null caso i seja inválido
     */
    public Integer get(int i) {
        if(i >= 0 && i < size) {
            return array[i];
        }
        else return null;
    }

    /**
     * O método size retorna o número de elementos atualmente no vetor.
     * @return o número de elementos atualmente no vetor.
     */
    public int size() {
        return size;
    }

    /**
     * O método capacity retorna a capacidade total do vetor.
     * @return o tamanho total do vetor
     */
    public int capacity() {
        return capacity;
    }

    /**
     * Retorna uma string contendo todos os elementos do vetor
     */
    public String toString() {
        String resultado = this.getClass().getSimpleName() + "[ ";
        for(int i = 0; i < size; i++) {
            resultado += (array[i] + " ");
        }
        resultado += "]";
        return resultado;
    }
    
    /**
     * O método equals retorna true se este vetor é igual ao vetor 
     * v passado como parâmetro; retorna false caso contrário.
     * @param v o Vetor a ser comparado
     * @return true se este vetor é igual a v; false caso contrário.
     */
    public boolean equals(Vetor v) {
        if(v == null) // v não existe
            return false;
        if(this.size != v.size())  // sizes diferentes
            return false;
        // Os vetores v e array existem e têm o mesmo tamanho.
        // Está faltando verificar, elemento a elemento, a igualdade
        for(int i = 0; i < size; i++) {
            if(!array[i].equals(v.array[i]))
                return false;
        }
        return true;
    }
}
