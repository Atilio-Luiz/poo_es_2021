/**
 * A interface ItemDeBiblioteca declara os campos e métodos que qualquer
 * item em uma biblioteca deve ter.
 */
public interface ItemDeBiblioteca {
    /**
     * Declaração dos campos da interface. Note que todo campo em
     * uma interface é considerado como public final, não podendo variar.
     */
    int maximoDeDiasParaEmprestimo = 14;

    /**
     * O método estaEmprestado retorna true se o item estiver emprestado e
     * retorna false caso contrário
     * @return true se o item estiver emprestado e false caso contrário
     */
    public boolean estaEmprestado();

    /**
     * O método empresta modifica o estado de um campo que indica se o item está
     * emprestado ou não para true
     */
    public void empresta();

    /**
     * O método devolve modifica o estado de um campo que indica se o item está
     * emprestado ou não para false
     */
    public void devolve();

    /**
     * O método localização retorna a localização do item na biblioteca
     * @return a localização do item na biblioteca
     */
    public String localizacao();

    /**
     * O método descricaoSumaria retorna uma string contendo uma descrição sumária
     * do item da biblioteca
     * @return a descrição sumária do item da biblioteca
     */
    public String descricaoSumaria();
}
