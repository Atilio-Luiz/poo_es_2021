/**
 * Esta classe demonstra o uso dos métodos da classe
 * CirculoEscalavel e sua relação com as interfaces ObjetoGeometrico e Escalavel
 */
public class Main {
    public static void main(String[] args) {
        // Declaramos e alocamos uma instância da classe CirculoEscalavel
        CirculoEscalavel ce =
                new CirculoEscalavel(new Ponto2D(10,10), 30);

        // Imprimimos a posição original do círculo escalável
        // fazendo uma chamada implícita do método toString
        System.out.println(ce);

        // Modificamos a escala do círculo
        ce.amplia(3);

        // Imprimimos novamente os dados do círculo
        System.out.println(ce);

        // Modificamos a posição do círculo (espelhando)
        ce.espelha();

        // Imprimimos novamente os dados do círculo
        System.out.println(ce);

        // Testamos a pertinência do objeto ce
        System.out.println(ce instanceof CirculoEscalavel);
        System.out.println(ce instanceof ObjetoGeometrico);
        System.out.println(ce instanceof Escalavel);
    }
}
