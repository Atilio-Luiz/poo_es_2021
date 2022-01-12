/**
 * Esta classe representa um livro à venda em uma livraria
 */
public class LivroDeLivraria {
    private String titulo, autor; // titulo do livro e nome do autor
    private String ISBN; // o ISBN (código) do livro
    private short estoque; // número de livros em estoque
    private float pCompra, pVenda; // preço de compra e venda

    public LivroDeLivraria (String tit, String aut, String isbn,
                     short est, float pc, float pv) {
        titulo = tit;
        autor = aut;
        ISBN = isbn;
        estoque = est;
        pCompra = pc;
        pVenda = pv;
    }

    public short quantosNoEstoque () {
        return estoque;
    }

    public float qualPrecoDeVenda () {
        return pVenda;
    }

    public float qualPrecoDeCompra () {
        return pCompra;
    }

    public String qualISBN () {
        return ISBN;
    }

    public String qualTitulo () {
        return titulo;
    }

    public void incrementaEstoque () {
        estoque++;
    }

    public void decrementaEstoque () {
        estoque--;
    }

    public String toString() {
        String res = "Título: "+titulo+"\n"+
                     "Autor: "+autor+"\n"+
                     "ISBN: "+ISBN+"\n"+
                     "Estoque: "+estoque+"\n"+
                     "Preço de compra: "+pCompra+"\n"+
                     "Preço de venda: "+pVenda+"\n";
        return res;
    }


}
