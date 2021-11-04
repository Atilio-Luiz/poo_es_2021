import java.util.ArrayList;
/**
 * Demosntração de funcionamento da classe genérica ArrayList<E>
 */
public class DemoArrayList {
    public static void main(String[] args) {
        // cria um ArrayList de Integers com capacidade inicial de 10
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        // Ilustrando o uso do método add
        numeros.add(2); // adiciona 2 ao final da lista, ou seja, na posição 0
        numeros.add(0, 1); // insere 1 na posição 0

        // Ilustrando o uso do método get
        System.out.print("Conteúdo no ArrayList:");
        for(int i = 0; i < numeros.size(); i++) {
            System.out.printf(" %d", numeros.get(i));
        }
        System.out.println();

        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        System.out.println("ArrayList: " + numeros); // invoca toString implicitamente
        
        // Remove um Integer do ArrayList passando o índice dele
        numeros.remove(2);
        System.out.println("ArrayList após a removação do elemento na posição 2: " + numeros);
        
        // Remove um Integer do ArrayList passando o valor dele
        numeros.remove(Integer.valueOf(4));
        System.out.println("ArrayList após a removação do elemento 4: " + numeros);
        
        // Sobrescreve o valor que estava na posição 2 do ArrayList
        numeros.set(2, Integer.valueOf(77));
        System.out.println("ArrayList após modificação do elemento na posição 2: " + numeros);
        
        // Ilustração do método contains
        if(numeros.contains((Integer)88)) { // usando casting e unboxing
            System.out.println("O ArrayList contém o número 88");
        }
        else {
            System.out.println("O ArrayList não contém o número 88");
        }

        // Ilustração do método toArray(T[])
        Integer[] arr = new Integer[numeros.size()];
        arr = numeros.toArray(arr);
        for(int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
        System.out.print("Elementos no vetor arr: ");
        for(Integer e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
        
    }
}