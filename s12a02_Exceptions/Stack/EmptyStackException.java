/**
 * Classe de exceção que indica quando
 * a pilha está vazia 
 */
class EmptyStackException extends Exception {
    // Construtor
    EmptyStackException(String msg) {
        super(msg);
    }
}
