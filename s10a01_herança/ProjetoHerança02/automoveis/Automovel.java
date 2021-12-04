package automoveis;

/**
 * A classe Automovel encapsula os dados de uma automóvel à venda
 */
public class Automovel {
    /**
     * Este valor representa o número máximo de prestações
     * e é usado somente para possibilitar cálculos de financiamento
     */
    private static final byte NUMERO_MAX_DE_PRESTACOES = 24;

    /**
     * Declaração dos campos da classe
     */
    private String modelo;  // o modelo do automóvel
    private String cor;     // a cor do automóvel
    private TipoCombustivel combustivel; // o tipo de combustível do automóvel

    /**
     * O construtor da classe Automovel recebe argumentos 
     * para inicializar seus campos.
     * @param modelo o modelo do automóvel
     * @param cor a cor do automóvel
     * @param combustivel o tipo de combustível que o automóvel usa
     */
    public Automovel(String modelo, String cor, TipoCombustivel combustivel) {
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
    }

    /**
     * O método quantoCusta retorna o preço do automóvel, 
     * calculado de acordo com o tipo de combustível.
     * @return o preço do automóvel
     */
    public float quantoCusta() {
        float preco = 0;
        switch(combustivel) {
            case MOVIDOAGASOLINA: preco = 12000.0f; break;
            case MOVIDOAALCOOL: preco = 10500.0f; break;
            case MOVIDOADIESEL: preco = 11000.0f; break;
            case MOVIDOAGAS: preco = 13000.0f; break;
        }
        return preco;
    }

    /**
     * O método quantasPrestações retorna o número máximo 
     * de prestações para este tipo de automóvel.
     * @return o número máximo de prestações
     */
    public byte quantasPrestacoes() {
        return NUMERO_MAX_DE_PRESTACOES;
    }

    /**
     * O método toString retorna uma string contendo os campos desta
     * classe com uma formatação simples.
     * @return os campos da classe formatados
     */
    @Override
    public String toString() {
        String resultado;
        resultado = modelo + " " + cor;
        switch(combustivel) {
            case MOVIDOAGASOLINA: resultado += "\nMovido a gasolina"; break;
            case MOVIDOAALCOOL: resultado += "\nMovido a álcool"; break;
            case MOVIDOADIESEL: resultado += "\nMovido a diesel"; break;
            case MOVIDOAGAS: resultado += "\nMovido a gás"; break;
        }
        return resultado;
    }
}