public class SemanaTest {
    public static void main(String[] args) 
    {
        for(Semana s : Semana.values()) 
        {
            System.out.printf("%s: %s: %s%n", s.getDia(), s.getNome(), s);
        }
    }
}