/**
 * A interface ItemRaroDeBiblioteca declara os campos e métodos
 * que itens raros em uma biblioteca devem ter
 */
public interface ItemRaroDeBiblioteca {
    /**
     * Note que todo atributo em uma interface é
     * considerado como public final, não podendo variar.
     */
    int MAXIMO_DE_DIAS_PARA_EMPRESTIMO = 1;
    boolean emprestimoPodeSerRenovado = false;

    /**
     * O método cuidadosEspeciais retorna uma string
     * contendo uma descrição dos cuidados especiais
     * que devem ser tomados ao manusear este item
     * @return os cuidados especiais a tomar com este item
     */
    public String cuidadosEspeciais();
}
