public class CreateWrapperBoxing {
    public static void main(String[] args) {
        Integer myInt = 5; // criando um novo Integer
        Double myDouble = 5.99; // criando um novo Double
        Character myChar = 'A'; // criando um novo Character

        myInt = 6;

        System.out.println(myInt); // chama toString() --> 6
        System.out.println(myDouble); // chama toString() ---> 5.99
        System.out.println(myChar); // chama toString() ---> A

        Integer intRef = myInt; // intRef = 6
        // cria um novo objeto Integer e o associa à
        // variável myInt
        myInt = 44; 
        System.out.println(myInt); // chama toString() ---> 44
        System.out.println(intRef); // chama toString()  --> 6

        if(intRef.equals(myInt)) {
            System.out.println("Eles têm o mesmo valor");
        }
        else {
            System.out.println("Eles têm valores distintos");
        }
    }
}