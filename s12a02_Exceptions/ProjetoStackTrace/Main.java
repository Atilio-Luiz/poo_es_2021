/**
 * Demonstrando getMessage e printStackTrace
 * da classe Exception
 */
public class Main {

    public static void main(String[] args) {

        try {
            metodo1();
        }
        catch (Exception exception) {
            System.err.printf("Mensagem de erro: %s\n\n", exception.getMessage());
            
            exception.printStackTrace();

            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.println("\nStack trace from getStackTrace:");
            System.out.println("Class\tFile\t\t\tLine\t\tMethod");

            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t\t", element.getFileName());
                System.out.printf("%s\t\t", element.getLineNumber());
                System.out.printf("%s\n", element.getMethodName());
            }
        }
    }

    // chama método 2; lança exceção de volta para main
    public static void metodo1 () throws Exception {
        metodo2();
    }

    // chama método 3; lança exceção de volta para metodo1
    public static void metodo2 () throws Exception {
        metodo3();
    }

    // lança Exception para metodo2
    public static void metodo3 () throws Exception {
        throw new Exception("Exception thrown in metodo3");
    }
}
