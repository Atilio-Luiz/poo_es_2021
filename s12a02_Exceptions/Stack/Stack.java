/**
 * Classe que implementa a estrutura de dados pilha
 */
public class Stack {
    private int top;
    private Object items[];

    /**
     * Construtor, cria uma pilha vazia
     * @param capacity a capacidade total da pilha
     */
    Stack(int capacity) {
        top = -1;
        items = new Object[capacity];
    }

    /**
     * Adiciona um elemento no topo da pilha
     * @param x elemento a ser adicionado na pilha
     * @throws FullStackException
     */
    void push(Object x) throws FullStackException {
        if(items.length == top + 1) {
            throw new FullStackException("error: full stack");
        }
        top++;
        items[top] = x; 
    }

    /**
     * Remove elemento do topo e retorna seu valor
     * @return elemento removido do topo
     * @throws EmptyStackException
     */
    Object pop() throws EmptyStackException {
        if(top == -1) {
            throw new EmptyStackException("error: empty stack");
        }
        top--;
        return items[top+1];
    }
}
