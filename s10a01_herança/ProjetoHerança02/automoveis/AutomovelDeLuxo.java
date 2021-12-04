package automoveis;

/**
 * A classe AutomovelDeLuxo, que encapsula os dados de um 
 * automóvel de luxo à venda, e que herda da classe AutomovelBasico.
 */
public class AutomovelDeLuxo extends AutomovelBasico {
    /**
     * Este valor representa o número máximo de prestações, 
     * e é usado somente para possibilitar cálculos de financiamento.
     * Note que esta constante foi definida na superclasse 
     * AutomovelBasico e está sendo ocultada aqui.
     */
    private static final byte NUMERO_MAX_DE_PRESTACOES = 36; // ocultação

    /**
     * Declaração dos campos da classe, acessórios que
     * um automóvel de luxo deve ter
     */
    private boolean direcaoHidraulica;
    private boolean cambioAutomatico;
    private boolean vidrosETravasEletricos;

    /**
     * Construtor da classe AutomovelDeLuxo, que recebe argumentos para 
     * inicializar seus campos
     * @param modelo o modelo do automóvel
     * @param cor a cor do automóvel
     * @param comb o tipo de combustível que o automóvel usa
     * @param retro true se o automóvel tem retrovisor do lado do passageiro
     * @param limpa true se o automóvel tem limpador do vidro traseiro
     * @param rádio true se o automóvel tem rádio AM/FM
     * @param dir true se o automóvel tem direção hidráulica
     * @param camb true se o automóvel tem câmbio automático
     * @param vidro true se o automóvel tem vidros e travas elétricos
     */
    public AutomovelDeLuxo(String modelo, String cor, TipoCombustivel comb,
                           boolean retro, boolean limpa, boolean radio,
                           boolean dir, boolean camb, boolean vidro)
    {
        super(modelo, cor, comb, retro, limpa, radio); 
        direcaoHidraulica = dir; 
        cambioAutomatico = camb;
        vidrosETravasEletricos = vidro;
    }

    /**
     * O construtor da classe AutomovelDeLuxo, que recebe argumentos 
     * para inicializar seus campos. Esta versão do construtor 
     * considera que os acessórios estão todos presentes.
     * @param m o modelo do automóvel
     * @param c a cor do automóvel
     * @param comb o tipo de combustível que o automóvel usa
     */
    public AutomovelDeLuxo(String modelo, String cor, TipoCombustivel comb) {
        super(modelo, cor, comb);
        direcaoHidraulica = true;
        cambioAutomatico = true;
        vidrosETravasEletricos = true;
    }

    /**
     * O método quantoCusta retorna o preço do automóvel, 
     * calculado de acordo com o tipo de combustível. 
     * Este método usa o método quantoCusta da superclasse para
     * calcular o preço-base do automóvel, e acrescenta o valor dos opcionais.
     * @return o preço do automóvel
     */
    @Override
    public float quantoCusta() {
        float preco = super.quantoCusta(); // calcula o preço-base do automóvel
        if(direcaoHidraulica) preco += 5340;
        if(cambioAutomatico) preco += 7500;
        if(vidrosETravasEletricos) preco += 2320;
        return preco;
    }

    /**
     * O método quantasPrestações retorna o número máximo de prestações 
     * para este tipo de automóvel. É necessário sobrepor o método 
     * herdado da classe Automóvel para que o valor correto seja impresso!
     * @return o número máximo de prestações
     */
    @Override
    public byte quantasPrestacoes() {   
        return NUMERO_MAX_DE_PRESTACOES;
    }

    /**
     * O método toString retorna uma String contendo os campos 
     * desta classe com uma formatação simples.
     * @return os campos da classe, formatados
     */
    @Override
    public String toString() {
        String resultado = super.toString(); 
        if(direcaoHidraulica) resultado += "\nCom direção hidráulica";
        if(cambioAutomatico) resultado += "\nCom câmbio automático";
        if(vidrosETravasEletricos) resultado += "\nCom vidros e travas elétricas";
        return resultado;
    }
}
