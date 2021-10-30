import java.util.Locale;
import java.util.Scanner;

public class WrapperExemplo2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt(); // autoboxing
        Integer b = sc.nextInt(); // autoboxing
        
        // Ilustrando o método compareTo
        if( a.compareTo(b) == 0 ) 
            System.out.println(a + " e " + b + " são iguais");
        else 
            System.out.println(a + " e " + b + " são diferentes");
        
        if(a == b) { // false
            System.out.println("a e b apontam para o mesmo objeto");
        }
        else {
            System.out.println("a e b apontam para objetos distintos"); // ---> vai ser impressa
        }

        
        // Ilustrando o método equals
        Integer z = 77;
        if(a.equals(z)) 
            System.err.println("os objetos apontados por a e z possuem o mesmo estado");
        else   
            System.out.println("os objetos apontados por a e z não possuem o mesmo estado");
        
        
        // Ilustrando o método hashCode
        System.out.println("hash code de a: " + a.hashCode());
        System.out.println("hash code de b: " + b.hashCode());
        System.out.println("hash code de z: " + z.hashCode());
        
        // Ilustrando conversões para outros tipos
        byte aByte = a.byteValue();
        short aShort = a.shortValue();
        int aInt = a.intValue();
        long aLong = a.longValue();
        float aFloat = a.floatValue();
        double aDouble = a.doubleValue();
        System.out.printf("%d %d %d %d %f %f%n", aByte, aShort, aInt, aLong, aFloat, aDouble);
        
    }
}