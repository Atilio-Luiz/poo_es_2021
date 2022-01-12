import java.util.Scanner;

public class Main {

    private static EstoqueDeLivraria estoque;

    public static void main(String[] args) {
        estoque = new EstoqueDeLivraria();
        estoque.adicionaLivro(new LivroDeLivraria("Distributed Programming with Java",
                                                 "Qusay H.Mahmoud",
                                                 "1-884777-65-1", (short) 10,
                                                 32.00f, 39.95f));
        estoque.adicionaLivro(new LivroDeLivraria("High Performance Java Platform",
                "Thomas H. Christofer",
                "0-333777-65-1", (short) 8,
                41.00f, 49.99f));
        estoque.adicionaLivro(new LivroDeLivraria("Programming and Deploying Java " +
                "Mobile Agents with Aglets",
                "Danny B. Lange, Mitsuru Oshima",
                "0-201-35582-9", (short) 5,
                28.00f, 37.95f));
        estoque.adicionaLivro(new LivroDeLivraria("Contructing Intelligent Agents" +
                "with Java",
                "Joseph P. Bigus, Jennifer Bigus",
                "0-201-35582-9", (short) 16,
                40.00f, 49.99f));

        boolean continua = true;
        while (continua) {
            System.out.println("Menu:");
            System.out.println("=====");
            System.out.println("1 - Consulta Estoque");
            System.out.println("2 - Vende Livro");
            System.out.println("3 - Compra Livro");
            System.out.println("9 - Mostra Caixa");
            System.out.println("x - Sai da aplicação");
            System.out.print("Opção ==> ");
            Scanner entrada = new Scanner(System.in);
            String opcao = entrada.next();
            switch (opcao) {
                case "1": System.out.println(estoque); break;
                case "2": estoque.vendeLivro(); break;
                case "3": estoque.compraLivro(); break;
                case "9": estoque.mostraCaixa(); break;
                case "x":
                case "X": continua = false; break;
                default: System.out.println("Opção ["+opcao+"] desconhecida!");
            }
        }
    }
}
