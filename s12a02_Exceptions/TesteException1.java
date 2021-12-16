public class TesteException1 {
    public static void main(String[] args) {
        int[] vet = {1, 2, 3, 4, 5};
        try {
            // Esse laço tentará acessar uma região fora do
            // intervalo do vetor: uma exceção será lançada
            for(int i = 0; i <= 9; i++)
                System.out.println( vet[i] );
        }
        catch(ArrayIndexOutOfBoundsException excp) {
            System.out.println(excp); // toString implícito
        }
        catch(Exception e) {
            System.out.println("Execução do catch Exception");
            System.out.println(e); // toString implícito
        }
        finally {
            System.out.println("finally sempre executado");
        }
    }
}