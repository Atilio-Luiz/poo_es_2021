import java.util.ArrayList;

/**
 * Classe Bicileta que ilustra o relacionamento de composição
 */
public class Bicicleta {
    /**
     * Os membros privados rodaDianteira, rodaTraseira, 
     * quadro, selim e guidao são as associações requeridas 
     * pelo tipo composto Bicicleta. São declarados privados 
     * para garantir que não sejam substituídos por null, 
     * o que tornaria a composição inválida com a ausência 
     * de qualquer um de seus componentes.
     */
    private Roda rodaDianteira, rodaTraseira;
    private Quadro quadro;
    private ArrayList<Selim> selim = new ArrayList<Selim>();
    private Guidao guidao;

    /**
     * Construtor da classe Bicicleta. O construtor toma como 
     * argumentos os componentes exigidos para a composição, 
     * validando e rejeitando componentes nulos. Apenas quando 
     * fornecidas duas instâncias distintas de Roda, uma instância 
     * de Quadro, de Selim e de Guidao, torna-se possível a 
     * instanciação de um objeto Bicicleta.
     * @param rd a roda dianteira
     * @param rt a roda traseira
     * @param q o quadro
     * @param s o selim
     * @param g o gudão
     */
    public Bicicleta(Roda rd, Roda rt, Quadro q, Selim s, Guidao g) {
        if (rd == null || rt == null || rd == rt) {
            throw new RuntimeException("Bicicleta requer duas rodas.");
        }
        if (q == null) {
            throw new RuntimeException("Bicicleta requer um quadro.");
        }
        if (s == null) {
            throw new RuntimeException("Bicicleta requer um selim.");
        }
        if (g == null) {
            throw new RuntimeException("Bicicleta requer um guidao.");
        }
        rodaDianteira = rd; 
        rodaTraseira = rt;
        quadro = q;
        selim.add(s);
        guidao = g;
    }

    // As operações de acesso getter permitem acessar e, portanto, 
    // navegar, unidirecionalmente, da instância de Bicicleta para 
    // as suas instâncias componentes.
    public Roda getRodaDianteira() { return rodaDianteira; }
    public Roda getRodaTraseira() { return rodaTraseira; }
    public Quadro getQuadro() { return quadro; }
    public ArrayList<Selim> getSelim() { return selim; }
    public Guidao getGuidao() { return guidao; }

    /**
     * Método toString, que retorna uma string descrevendo
     * os componentes da bibicleta. O método toString() de 
     * Bicicleta produz uma String que concatena o nome da 
     * classe do tipo Bicicleta e, também, os nomes das classes 
     * de seus componentes, cujos métodos toString() são 
     * implicitamente acionados quando suas referências são usadas 
     * para suprir um argumento de tipo %s, que indica um tipo String. 
     * Este método mostra uma possível forma de propagação de 
     * mensagens entre o objeto composto e seus componentes.
     */
    public String toString() {
        return String.format("%s:\n\t%s,\n\t%s,\n\t%s,\n\t%s,\n\t%s\n",
            getClass().getName(), rodaDianteira, rodaTraseira, 
            quadro, selim, guidao);
    } 
    
 }