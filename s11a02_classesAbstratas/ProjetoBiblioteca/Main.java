/**
 * Esta classe demonstra o uso de instâncias da classe LivroDeBiblioteca
 */
public class Main {

    public static void main(String[] args) {

        LivroDeBiblioteca livro01 =
                new LivroDeBiblioteca("O alquimista", "Paulo Coelho", (short)990,
                        (short)2000, "Estante C, prateleira 3");

        LivroDeBiblioteca livro02 =
                new LivroDeBiblioteca("Essential Cell Biology", "Bruce Alberts, Dennis Bray",
                        (short)740, (short)1997, "Estante A, prateleira 1");

        // Emprestamos um dos livros
        livro01.empresta();
        // Imprimimos os dados dos livros
        System.out.println(livro01);
        System.out.println();
        System.out.println(livro02);
    }
}
