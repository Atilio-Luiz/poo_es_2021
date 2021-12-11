/**
 * A classe LivroDeBiblioteca encapsula os dados de um livro de Biblioteca.
 * Esta classe herda todos os campos e métodos da classe Livro (consideramos
 * que campos privados são herdados, mesmo que não possam ser acessados diretamente),
 * e implementa os métodos declarados na interface ItemDeBiblioteca
 */
public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    /**
     * Declaração dos campos da classe
     */
    // Este campo indica o status do empréstimo do material
    private boolean estaEmprestado;
    // Este campo representa a localização do livro na biblioteca
    private String localizacao;

    /**
     * Construtor completo
     * @param tit o título do livro
     * @param aut os nomes dos autores do livro
     * @param np o número de páginas do livro
     * @param ae o ano da edição do livro
     * @param loc a localização do livro
     */
    public LivroDeBiblioteca(String tit, String aut, short np, short ae, String loc) {
        super(tit, aut, np, ae); // delega a inicialização ao construtor da classe ancestral
        localizacao = loc;
        estaEmprestado = false; // se acabou de ser criado, não deve estar emprestado ainda
    }

    /**
     * O método empresta deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca. Este método modifica o valor do campo estaEmprestado para true.
     */
    @Override
    public void empresta(){
        estaEmprestado = true;
        System.out.print("O livro "+qualTitulo()+" foi emprestado e deverá ser ");
        System.out.println("devolvido em "+maximoDeDiasParaEmprestimo+" dias.");
    }

    /**
     * O método empresta deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca. Este método modifica o valor do campo estaEmprestado para false.
     */
    @Override
    public void devolve() {
        estaEmprestado = false;
    }

    /**
     * O método estaEmprestado deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca. Este método retorna o valor do campo privado estaEmprestado.
     * @return o valor do campo estaEmprestado
     */
    @Override
    public boolean estaEmprestado() {
        return estaEmprestado;
    }

    /**
     * O método localizacao deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca. Este método retorna o valor do campo privado localizacao.
     * @return o valor do campo localizacao
     */
    @Override
    public String localizacao() {
        return localizacao;
    }

    /**
     * O método localizacao deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca.
     * @return uma descrição sumária do livro
     */
    @Override
    public String descricaoSumaria() {
        return qualTitulo()+" "+qualAutor();
    }

    /**
     * Método toString
     * @return uma string contendo uma representação dos campos desta classe
     */
    @Override
    public String toString() {
        String temporaria = super.toString();
        temporaria += "Localização      :"+localizacao+"\n";
        if (estaEmprestado)
            temporaria += "Este livro está emprestado";
        else
            temporaria += "Este livro está disponível para empréstimo";
        return temporaria;
    }
}
