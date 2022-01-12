import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 * A classe representa uma coleção de instâncias da classe
 * LivroDeLivraria. As instâncias serão armazenadas em um mapa,
 * onde a chave é o ISBN do livro e o valor é a instância da classe
 * LivroDeLivraria associada. Esta classe contém métodos simples
 * para simular a compra e venda de livros da coleção
 */
public class EstoqueDeLivraria {
    // Declaração dos campos da classe
    private Map<String, LivroDeLivraria> estoque;
    private float saldoDoCaixa; // valor das vendas efetuadas

    /**
     * Construtor
     */
    public EstoqueDeLivraria () {
        estoque = new HashMap<String, LivroDeLivraria>();
    }

    /**
     * Adiciona livro à coleção
     * @param livro uma instância da classe LivroDeLivraria
     */
    public void adicionaLivro (LivroDeLivraria livro) {
        String isbn = livro.qualISBN(); // recuperamos o isbn para usar como chave
        estoque.put(isbn,livro); // adicionamos o par isbn-livro ao mapa
    }

    /**
     * Mostra o balanço do caixa
     */
    public void mostraCaixa () {
        Locale.setDefault(Locale.US);
        System.out.printf("Saldo do caixa: R$ %.2f%n", saldoDoCaixa);
    }

    public void vendeLivro () {
        // Recuparamos um ISBN de livro no estoque com um menu
        String ISBN = escolheLivro();
        // Recuperamos o livro correspondente do mapa
        LivroDeLivraria livro = estoque.get(ISBN);
        // Se existir estoque, efetua venda simbólica do livro,
        // decrementando seu estoque e incrementando o nosso caixa
        if (livro.quantosNoEstoque() > 0) {
            livro.decrementaEstoque();
            saldoDoCaixa += livro.qualPrecoDeVenda();
            System.out.println("Quantidades do livro "+
                    livro.qualTitulo()+" no estoque: "+
                    livro.quantosNoEstoque());
            mostraCaixa();
        }
        else
            System.out.println("Não temos dinheiro em caixa para " +
                    "comprar o livro "+livro.qualTitulo()+" !");
    }

    public void compraLivro () {
        // Recuperamos um ISBN de livro no estoque com um menu
        String ISBN = escolheLivro();
        // Recuperamos o livro correspondente do mapa
        LivroDeLivraria livro = estoque.get(ISBN);

        if (saldoDoCaixa > livro.qualPrecoDeCompra()) {
            livro.incrementaEstoque();
            saldoDoCaixa -= livro.qualPrecoDeCompra();
            System.out.println("Quantidades do livro "+livro.qualTitulo()+
                    " no estoque: "+livro.quantosNoEstoque());
            mostraCaixa();
        }
        else {
            System.out.println("Não temos dnheiro em caixa para comprar o livro "+
                    livro.qualTitulo());
        }
    }

    private String escolheLivro () {
        System.out.println("========================================");
        List<String> listaDeISBNs = new ArrayList<String>(estoque.keySet());
        for (int indice = 0; indice < listaDeISBNs.size(); indice++) {
            LivroDeLivraria livro = estoque.get(listaDeISBNs.get(indice));
            System.out.println((indice+1)+" "+livro.qualTitulo()+
                    " R$ "+livro.qualPrecoDeVenda());
            System.out.println("========================================");
        }
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();
        while ((opcao <= 0) || (opcao > listaDeISBNs.size())) {
            System.out.println("Por favor, entre um valor entre 1 e "+
                    listaDeISBNs.size());
            opcao = entrada.nextInt();
        }
        return listaDeISBNs.get(opcao-1);
    }

    public String toString () {
        String resultado = "\n==========================================\n";
        Iterator livros = estoque.keySet().iterator();
        while (livros.hasNext()) {
            LivroDeLivraria livro = estoque.get(livros.next());
            resultado += livro.toString();
            resultado += "=========================================\n";
        }
        return resultado;
    }
}
