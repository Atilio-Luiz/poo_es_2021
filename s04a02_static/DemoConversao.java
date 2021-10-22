/**
 * A classe DemoConversao demonstra usos dos métodos
 * estáticos da classe Conversao
 */
public class DemoConversao {
    public static void main(String[] args) {
        System.out.println("Vinte pés são " + 
            Conversao.pesParaCentimetros(20) + " centímetros");
        
        System.out.println("Cinco polegadas são " +
            Conversao.polegadasParaCentimetros(5) + " centímetros");

        Conversao cv = new Conversao(); // Desnecessária a criação desta instância

        System.out.println("Cinquenta milhas são " +
            cv.milhasParaQuilometros(50) + " quilômetros"); // o compilador mostra um warning
        
        System.out.println("Cinquenta milhas são " +
            Conversao.milhasParaQuilometros(50) + " quilômetros");
    }
}