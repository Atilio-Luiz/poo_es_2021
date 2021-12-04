package ufc.quixada.pessoa;

import ufc.quixada.datahora.Data;

/**
 * A classe Pessoa, que encapsula os dados de identificação de uma pessoa.
 * A classe Pessoa, assim como toda classe em java, herda de Object. 
 */
public class Pessoa {
    /**
     * Declaração dos campos da classe
     */
    private String nome;      // o nome da pessoa
    private int identidade;   // o número da identidade da pessoa
    private Data nascimento;  // a data de nascimento da pessoa

    /**
     * O construtor da classe Pessoa, que recebe argumentos
     * para inicializar seus campos
     * @param nome o nome da pessoa
     * @param identidade o número da identidade da Pessoa
     * @param nascimento a data de nascimento da Pessoa
     */
    public Pessoa(String nome, int identidade, Data nascimento) {
        this.nome = nome;
        this.identidade = identidade;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentidade() {
        return identidade;
    }

    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * O método toString não recebe argumentos, e retorna uma String
     * contendo os valores dos campos da classe formatada
     */
    @Override // indica que este método sobrescreve uma método da superclasse
    public String toString() {
        return "Nome: " + nome + "\nIdentidade: " + identidade + " " + 
               "\nData de Nascimento: " + nascimento;
    }
    
}