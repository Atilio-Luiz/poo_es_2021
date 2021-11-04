import java.util.Arrays;

public class ArrayManipulations {
    public static void main(String[] args) {
        // Testando a ordenação em ordem crescente
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        System.out.println("Array com toString original: " + doubleArray);
        System.out.println("Array original: " + Arrays.toString(doubleArray));
        Arrays.sort(doubleArray);
        System.out.println("Array ordenado: " + Arrays.toString(doubleArray));
        
        // busca o valor 9.3 no array origArray
        // note que origArray está ordenado, então podemos usá-lo aqui 
        int location = Arrays.binarySearch(doubleArray, 9.3);
        if(location >= 0) {
            System.out.println("Valor 9.3 encontrado na posição " + location);
        }
        else {
            System.out.println("Valor 9.3 não foi encontrado");
        }
        
        // busca o valor 77.65 no array origArray
        // note que origArray está ordenado, então podemos usá-lo aqui 
        location = Arrays.binarySearch(doubleArray, 77.65);
        if(location >= 0) {
            System.out.println("Valor 77.65 encontrado na posição " + location + " do vetor");
        }
        else {
            System.out.println("Valor 77.65 não foi encontrado");
        }
        
        // Testando o preenchimento do array
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        System.out.println("Array preenchido com 7: " + Arrays.toString(filledIntArray));
        Arrays.fill(filledIntArray, 2, 8, 33);
        System.out.println("Array parcialmente preenchido com 33: " + Arrays.toString(filledIntArray));
        
        
        // Testando cópia de array
        int[] origArray = {23, 56, 76, 9, 10};
        int[] copyArray = Arrays.copyOf(origArray, origArray.length);
        System.out.println("Array original: " + Arrays.toString(origArray));
        System.out.println("Array copiado: " + Arrays.toString(copyArray));
        
        // Compara origArray e copyArray
        boolean b = Arrays.equals(origArray, copyArray);
        if(b) System.out.println("Arrays são iguais");
        else System.out.println("Arrays são diferentes");
        
        // Testando o método copyOfRange
        int[] copyArray2 = Arrays.copyOfRange(origArray, 1, origArray.length);
        System.out.println("Array original: " + Arrays.toString(origArray));
        System.out.println("Array copiado de intervalo [1..n-1]: " + Arrays.toString(copyArray2));

        // Compara origArray e copyArray2
        b = Arrays.equals(origArray, copyArray2);
        if(b) System.out.println("Arrays são iguais");
        else System.out.println("Arrays são diferentes");   
    }
}