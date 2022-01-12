import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * A classe Loteria contém um método estático (sorteiaNumeros) que
 * demonstra o uso de um Set para sortear números únicos (isto é, sem repetição).
 * A classe também contém um método main que demonstra o método sorteiaNumeros.
 */
public class Loteria {
    /**
     * O método sorteiaNumeros recebe um inteiro como argumento e retorna um 
     * array de valores inteiros aleatórios cujo tamanho é o passado como argumento.
     * @param quantidade o número de valores inteiros aleatórios que devem ser sorteados
     * @return um array contendo os valores aleatórios
     */
    public static int[] sorteiaNumeros(int quantidade) {
        Set<Integer> numeros = new TreeSet<Integer>();
        while(numeros.size() < quantidade) {
            Integer valor = (int) (100 * Math.random());
            numeros.add(valor);
        }
        // Agora, transformamos o set em um array de inteiros
        int[] array = new int[numeros.size()];
        int indice = 0;
        System.out.println(numeros.iterator());
        Iterator i = numeros.iterator();
        while(i.hasNext()) {
            Integer temp = (Integer) i.next();
            array[indice++] = temp.intValue();
            i.remove();
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = sorteiaNumeros(10);
        System.out.println(Arrays.toString(array));

        int[] array2 = sorteiaNumeros(20);
        System.out.println(Arrays.toString(array2));
    }
}