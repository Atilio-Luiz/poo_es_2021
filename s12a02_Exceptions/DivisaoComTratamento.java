import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoComTratamento {
   /**
    * Método que calcula a divisão inteira entre dois inteiros
    * @param numerador o numerador da divisão
    * @param denominador o denominador da divisão
    * @return um inteiro, quociente da divisão
    * @throws ArithmeticException quando uma divisão por 0 for realizada
    */
   public static int quociente(int numerador, int denominador) 
      throws ArithmeticException {
      return numerador / denominador; // possível divisão por zero
   } 

   public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in); 
      boolean continuarLoop = true; // determina se mais entrada será necessária

      do {                                                                
         try {                  
            System.out.print("Entre um numerador (inteiro): ");    
            int numerador = scanner.nextInt();                            
            System.out.print("Entre um denominador (inteiro): ");  
            int denominador = scanner.nextInt();                          
                                                                          
            int resultado = quociente(numerador, denominador);              
            System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);                                     
            continuarLoop = false;
            //System.exit(0);         
         }                                                              
         catch (InputMismatchException inputMismatchException) {        
            System.err.printf("%nExceção: %s%n",inputMismatchException);                                  
            scanner.nextLine(); // decarta entrada para que usuário possa tentar novamente    
            System.out.printf("Você deve entrar inteiros. Por favor, tente novamente.%n%n");          
         }                                                              
         catch (ArithmeticException arithmeticException) {              
            System.err.printf("%nExceção: %s%n", arithmeticException);
            System.out.printf("Zero não é um denominador válido. Tente novamente.%n%n");   
         }   
         finally {
            System.out.println("\nfinally executado");
         }                                                           
      } while (continuarLoop);                                           
   } 
} 

