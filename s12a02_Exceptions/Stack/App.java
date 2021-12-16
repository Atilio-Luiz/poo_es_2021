public class App {
    public static void main(String[] args) throws Exception {
        Stack pilha = new Stack(10);

        try {
            for(int i = 1; i <= 10; ++i) 
                pilha.push(i);
        }
        catch(FullStackException e) {
            System.out.println(e.getMessage());
        }
        

        try {
            for(int i = 1; i <= 11; ++i) 
                System.out.println(pilha.pop());
        }
        catch(EmptyStackException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
            

    }
}
