/**
 * Classe de exceção que indica quando
 * a pilha está cheia 
 */
class FullStackException extends Exception {
    // Construtor
    FullStackException(String msg) {
        super(msg);
    }
}
