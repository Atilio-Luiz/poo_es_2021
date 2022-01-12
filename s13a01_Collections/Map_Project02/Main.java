/**
 * Esta classe demonstra o uso de uma instância da classe
 * ArrayEsparsoDeDoubles.
 */
public class Main {
    /**
     * O método main permite a execução desta classe. Este método
     * cria uma instância da classe ArrayEsparsoDeDoubles e usa
     * alguns de seus métodos.
     */
    public static void main(String[] args) {
        ArrayEsparsoDeDoubles array = new ArrayEsparsoDeDoubles();

        array.modifica(0, 123.456);

        array.modifica(123712L, Math.PI);

        array.modifica(9223372036854775807L, 1.0);

        System.out.println(array);
    }
}
