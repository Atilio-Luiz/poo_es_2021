package automoveis;

public class AutomovelBasico extends Automovel {
    /**
     * Declaração dos campos da classe 
     * Acessórios que um automóvel básico deve ter
     */
    private boolean retrovisorDoLadoDoPassageiro;
    private boolean limpadorDoVidroTraseiro;
    private boolean radioAMFM;

    /**
     * O construtor da classe AutomovelBasico, que recebe 
     * argumentos para inicializar seus campos.
     * @param modelo o modelo do automóvel
     * @param cor a cor do automóvel
     * @param combustivel o tipo de combustível que o automóvel usa
     * @param retro true se o automóvel tem retrovisor do lado do passageiro
     * @param limpa true se o automóvel tem limpador do vidro traseiro
     * @param radio true se o automóvel tem rádio AM/FM
     */
    public AutomovelBasico(String modelo, String cor, TipoCombustivel combustivel,
                    boolean retro, boolean limpa, boolean radio) 
    {
        super(modelo, cor, combustivel);
        retrovisorDoLadoDoPassageiro = retro;
        limpadorDoVidroTraseiro = limpa;
        radioAMFM = radio;
    }

    /**
     * Esta versão do construtor considera que os acessórios estão todos presentes.
     * @param modelo o modelo do automóvel
     * @param cor a cor do automóvel
     * @param combustivel o tipo de combustível que o automóvel usa
     */
    public AutomovelBasico(String modelo, String cor, TipoCombustivel combustivel) {
        super(modelo, cor, combustivel);
        retrovisorDoLadoDoPassageiro = true;
        limpadorDoVidroTraseiro = true;
        radioAMFM = true;
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
        float preco = super.quantoCusta();
        if(retrovisorDoLadoDoPassageiro) preco += 280;
        if(limpadorDoVidroTraseiro)      preco += 650;
        if(radioAMFM)                    preco += 190;
        return preco;
    }

    /**
     * O método toString retorna uma String contendo os 
     * campos desta classe com uma formatação simples.
     * @return os campos da classe, formatados
     */
    @Override
    public String toString() {
        String resultado = super.toString();
        if(retrovisorDoLadoDoPassageiro)
            resultado += "\nCom retrovisor do lado do passageiro";
        if(limpadorDoVidroTraseiro)
            resultado += "\nCom limpador do vidro traseiro";
        if(radioAMFM)
            resultado += "\nCom rádio AM/FM";
        return resultado;
    }
}
