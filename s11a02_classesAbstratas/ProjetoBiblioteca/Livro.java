/**
 * A classe Livro encapsula os dados de um livro. Para simplificar,
 * somente os campos e métodos mais básicos são implementados nesta classe.
 */
public class Livro {
    /**
     * Declaração dos campos da classe
     */
    private String titulo, autor;
    private short numeroDePaginas;
    private short anoDaEdicao;

    /**
     * Construtor "Completo"
     * @param tit o título do livro
     * @param aut os nomes dos autores do livro
     * @param np o número de páginas do livro
     * @param ae o ano da edição do livro
     */
    public Livro(String tit, String aut, short np, short ae) {
        titulo = tit;
        autor = aut;
        numeroDePaginas = np;
        anoDaEdicao = ae;
    }

    /**
     * O método qualTitulo retorna o título deste livro
     * @return o título do livro
     */
    public String qualTitulo() {
        return titulo;
    }

    /**
     * O método qualTitulo retorna o autor deste livro
     * @return o autor do livro
     */
    public String qualAutor() {
        return autor;
    }

    /**
     * Método toString
     * @return uma string contendo uma representação dos campos desta classe
     */
    @Override
    public String toString() {
        return "Título            :"+titulo+"\n"+
               "Autor             :"+autor+"\n"+
               "Número de páginas :"+numeroDePaginas+"\n"+
               "Ano da Edição     :"+anoDaEdicao+"\n";
    }
}
