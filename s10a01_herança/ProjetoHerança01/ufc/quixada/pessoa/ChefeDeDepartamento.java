package ufc.quixada.pessoa;

import ufc.quixada.datahora.Data;

/**
* A classe ChefeDeDepartamento, que encapsula os dados básicos de um chefe de um
* departamento de uma empresa. Esta classe herda da classe Funcionario, criando a
* relação "ChefeDeDepartamento é um tipo de Funcionario".
*/
public class ChefeDeDepartamento extends Funcionario {
    /**
     * Declaração dos campos adicionais da classe. 
     * Note que não é necessário declarar um campo como sendo 
     * instância da classe Funcionario. Somente os campos que
     * diferenciam um ChefeDeDepartamento de um Funcionario são necessários.
     */
    private String departamento;
    private Data promocaoAChefe;

    /**
     * O construtor para a classe ChefeDeDepartamento, que recebe argumentos 
     * para inicializar todos os campos da classe. Este construtor recebe os 
     * mesmos dados que seriam necessários para criar uma instância da classe 
     * Pessoa mais os que diferenciam a classe Funcionario da classe Pessoa 
     * e os que diferenciam a classe ChefeDeDepartamento da classe Funcionario. 
     * Passaremos os dados que representam um Funcionario para o construtor 
     * da classe ancestral, via a palavra-chave super.
     * @param nome o nome da pessoa
     * @param id o número da identidade da pessoa
     * @param nasc uma instância da classe Data com a data de nascimento
     * @param adm uma instância da classe Data com a data de admissão
     * @param salario o salário do funcionário/chefe de departamento
     * @param dep o departamento que este chefe chefia
     * @param prom uma instância da classe Data com a data de promoção ao cargo
     */
    public ChefeDeDepartamento(String nome, int id, Data nasc, 
                        Data adm, float salario, 
                        String dep, Data prom)
    {
        super(nome, id, nasc, adm, salario); // chama construtor da classe Funcionario
        departamento = dep;
        promocaoAChefe = prom;
    }

    /**
     * O método toString não recebe argumentos, e retorna uma String 
     * contendo os valores dos campos da classe formatados. 
     * Como é necessário ter os campos da classe ancestral formatados 
     * para retornar todos os campos desta classe formatados, chamamos 
     * o método toString da classe ancestral via a palavra-chave super.
     * @return uma String com os valores dos campos formatados.
     */
    @Override
    public String toString() {
        String resultado;
        resultado = super.toString() + "\n";
        resultado += "Departamento: " + departamento + "\n";
        resultado += "Data de promoção ao cargo: " + promocaoAChefe;
        return resultado;
    }

    /**
     * O método getDepartamento retorna o departamento do 
     * chefe de departamento. Este método será usado por 
     * qualquer outro método que queira acessar (ler) somente o
     * valor do campo departamento.
     * @return o departamento do chefe de departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Método getDataPromocao
     * @return a data de promoção do chefe
     */
    protected Data getDataPromocao() {
        return promocaoAChefe;
    }
}
