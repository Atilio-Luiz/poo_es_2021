/**
 * A classe Mapa encapsula os dados de um mapa
 * (considerando mapas como tipos de documentos
 * em bibliotecas, por exemplo). Para simplificar,
 * somente alguns campos e métodos mais básicos
 * são implementados nesta classe.
 */
public class Mapa {
    /**
     * Declaração dos campos da classe
     */
    private String titulo;  // o título do mapa
    private float escala;   // a escala em que o mapa está
    private String descricaoSumaria;    // uma descrição do mapa

    /**
     * Cosntrutor completo
     * @param tit o título do livro
     * @param esc os nomes dos autores do livro
     * @param ds descrição sumária
     */
    public Mapa(String tit, float esc, String ds) {
        titulo = tit;
        escala = esc;
        descricaoSumaria = ds;
    }

    /**
     * O método qualTitulo retorna o título deste mapa
     * @return o título deste mapa
     */
    public String qualTitulo() {
        return titulo;
    }

    /**
     * O método descricaoSumaria retorna a descrição sumária deste mapa
     * @return a descrição sumária do mapa
     */
    public String descricaoSumaria() {
        return descricaoSumaria;
    }

    @Override
    public String toString() {
        return "Título            : "+titulo+"\n"+
               "Escala            : "+escala+"\n"+
               "Descrição Sumária : "+descricaoSumaria+"\n";
    }
}
