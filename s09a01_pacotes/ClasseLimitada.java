/**
 * A ClasseLimitada permite que sejam instanciadas no
 * máximo cinco objetos desta classe.
 */
public class ClasseLimitada {
    private static final byte MAX = 5; // número máximo de objetos instanciados
    private static int contador = 0; // número de objetos instanciados

    /**
     * Construtor privado!
     */
    private ClasseLimitada() {
        contador++; 
        System.out.println("Objeto " + contador + " criado");
    }

    public static ClasseLimitada getInstance() {
        if(contador < MAX) 
            return new ClasseLimitada();
        else 
            return null;
    }
}