import java.util.Scanner;

/**
 * A classe JogoDaForca encapsula os mecanismos de um jogo da forca simples.
 * O objetivo do jogo é adivinhar a palavra determinada por um adversário
 * em um número mínimo de tentativas. Esta classe assume que os caracteres
 * da palavra encapsulada e os caracteres entrados pelo usuário são minúsculos.
 */
public class JogoDaForca {
    private String palavra; // a palavra que deve ser adivinhada
    private int comprimento; // o comprimento desta palavra
    private boolean[] corretas; // um array de valores booleanos que indicará para
                                // cada letra, se ela já foi corretamente adivinhada
    private boolean[] letrasUtilizadas; // um array de valores booleanos que indicará,
                                        // para cada letra do alfabeto, se ela já foi utilizada.

    /**
     * O construtor da classe. O construtor receberá um argumento que é a palavra
     * que deve ser adivinhada, e preencherá outros campos desta classe de acordo
     * com as informações obtidas desta palavra. 
     * @param palavra a palavra a ser adivinhada
     */
    public JogoDaForca(String palavra) {
        this.palavra = palavra;
        comprimento = palavra.length(); // uso do método length
        corretas = new boolean[comprimento]; // false
        letrasUtilizadas = new boolean[26]; // false
    }

    /**
     * O método pergunta mostra o resultado do jogo até o presente momento
     * e pergunta ao usuário qual é o próximo caractere a ser adivinhado. 
     * Este método modifica os arrays encapsulados pela classe, atualizando
     * as letras da palavra que já foram adivinhadas corretamente e as letras
     * do alfabeto que já foram utilizadas.
     */
    public void pergunta() {
        // Mostramos ao jogador quais letras da palavra já foram adivinhadas
        mostraAdivinhadas();
        // Mostramos ao jogador quais letras da palavra já foram utilizadas
        mostraUtilizadas();
        // Pedimos ao usuário que entre uma letra
        System.out.print("Entre uma letra: ");
        Scanner input = new Scanner(System.in);
        char tentativa = input.next().charAt(0); // uso do método charAt
        // Dizemos que aquela letra já foi utilizada
        letrasUtilizadas[tentativa-'a'] = true;
        // Marcamos todas as letras iguais a esta no array de letras ocultas
        for(int i = 0; i < comprimento; i++) {
            if(palavra.charAt(i) == tentativa) {
                corretas[i] = true;
            }
        }
    }

    /**
     * Este método mostra quais letras da palavra já foram adivinhadas.
     * Este método é chamado como uma subrotina de outro método desta
     * classe, podendo ser declarado como privado.
     */
    private void mostraAdivinhadas() {
        // Mostra ao usuário as letras da palavra que já foram adivinhadas
        System.out.print("Adivinhado até agora: ");
        for(int i = 0; i < comprimento; i++) {
            if(corretas[i]) 
                System.out.print(palavra.charAt(i) + " "); // uso do método charAt
            else 
                System.out.print("_ ");
        }
        System.out.println();
    }

    /**
     * Este método mostra quais letras da palavra já foram utilizadas.
     * Este método é chamado como uma subrotina de outro método desta
     * classe, podendo ser declarado como privado.
     */
    private void mostraUtilizadas() {
        // Mostra ao usuário as letras da palavra que já foram utilizadas
        System.out.print("Letras já utilizadas: ");
        for(int i = 0; i < 26; i++) {
            if(letrasUtilizadas[i]) {
                System.out.print((char) ('a' + i));
            }
        }
        System.out.println();
    }

    /**
     * Este método calcula e retorna o número de letras da 
     * palavra que ainda não foram adivinhadas.
     * @return o número de letras da palavra que ainda não foram adivinhadas
     */
    public int quantasLetrasAindaNãoAdivinhadas() {
        int total = 0;
        for(int i = 0; i < comprimento; i++) {
            if(!corretas[i]) {
                total++;
            }
        }
        return total;
    }
}