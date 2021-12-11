/**
 * A classe MapaDeBiblioteca encapsula os dados de um mapa
 * de uma biblioteca. Esta classe herda todos os campos e
 * métodos da classe Mapa e implementa os métodos declarados
 * na interface ItemDeBiblioteca.
 * ESTA CLASSE NÃO PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS
 */
public class MapaDeBiblioteca extends Mapa
        implements ItemDeBiblioteca, ItemRaroDeBiblioteca {
    private boolean estaEmprestado;
    private final String localizacao = "Mapoteca";

    /**
     * Construtor que recebe argumentos para inicializar
     * todos os campos da classe
     * @param tit o título do mapa
     * @param esc a escala do mapa
     * @param ds uma descrição sumária do mapa
     */
    public MapaDeBiblioteca (String tit, float esc, String ds) {
        // delega a inicialização ao construtor
        // da classe ancestral
        super(tit,esc,ds);
        // Se acabou de ser criado, não deve
        // estar emprestado ainda
        estaEmprestado = false;
    }

    /**
     * O método empresta deve ser implementado porque foi
     * declarado na interface ItemDeBiblioteca. Este método
     * modifica o valor do campo estaEmprestado para true.
     */
    @Override
    public void empresta () {
        estaEmprestado = true;
        System.out.print("O mapa "+qualTitulo()+" foi emprestado, e deverá ser ");
        System.out.println("devolvido em "+
            ItemRaroDeBiblioteca.MAXIMO_DE_DIAS_PARA_EMPRESTIMO+" dias.");
    }

    /**
     * O método devolve deve ser implementado porque foi
     * declarado na interface ItemDeBiblioteca. Este método
     * modifica o valor do campo estaEmprestado para false.
     */
    @Override
    public void devolve () {
        estaEmprestado = false;
    }

    /**
     * O método estaEmprestado deve ser implementado porque foi
     * declarado na interface ItemDeBiblioteca. Este método
     * retorna o valor do campo privado estaEmprestado.
     */
    @Override
    public boolean estaEmprestado () {
        return estaEmprestado;
    }

    /**
     * O método localizacao deve ser implementado porque foi
     * declarado na interface ItemDeBiblioteca. Este método
     * retorna o valor do campo privado localizacao.
     */
    @Override
    public String localizacao () {
        return localizacao;
    }

    /**
     * O método descricaoSumaria deve ser implementado porque foi
     * declarado na interface ItemDeBiblioteca.
     */
    @Override
    public String descricaoSumaria () {
        return qualTitulo()+" ("+super.descricaoSumaria()+")";
    }

    /**
     * O método cuidadosEspeciais deve ser implementado porque foi
     * declarado na interface ItemRaroDeBiblioteca.
     * @return os cuidados especiais a serem tomados com este item
     */
    @Override
    public String cuidadosEspeciais () {
        return "Não amassar, dobrar ou tirar cópias heliográficas.";
    }

    /**
     * Método toString
     * @return uma string contendo uma representação dos campos
     * desta classe
     */
    @Override
    public String toString () {
        String temporaria = super.toString();
        temporaria += "Localização :"+localizacao+"\n";
        if (estaEmprestado)
            temporaria += "Este mapa está emprestado.\n";
        else
            temporaria += "Este mapa está disponível para empréstimo.\n";
        temporaria += "Cuidados especiais: "+cuidadosEspeciais();
        return temporaria;
    }

}
