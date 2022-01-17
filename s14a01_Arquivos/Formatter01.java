import java.util.Formatter;

public class Formatter01 {
  public static void main(String args[]) {
    Formatter fmt = new Formatter();
    fmt.format("%s comprou %d laranjas por %.2f reais", 
      "Maria", 3, 15.7698); 
    System.out.println(fmt.out());
    fmt.close();
  }
}
