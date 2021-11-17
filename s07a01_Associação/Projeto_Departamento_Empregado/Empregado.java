public class Empregado  {
    /**
     * Declaração dos atributos
     */
    private String cpf;
    private String nome;
    private float salario;
    private Departamento dept; // departamento para o qual empregado trabalha

    /**
     * Construtor para a classe Empregado, que inicializa todos os
     * campos do objeto instanciado.
     * @param cpf o cpf do empregado
     * @param nome o nome do empregado
     * @param salario o salário do empregado
     * @param dept a referência para o departamento do Empregado
     */
    Empregado(String cpf, String nome, float salario, Departamento dept) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.dept = dept;
    }

    /**
     * Construtor para a classe Empregado, que inicializa quase todos os
     * campos do objeto instanciado, com exceção do departamento. 
     * @param cpf o cpf do empregado
     * @param nome o nome do empregado
     * @param salario o salário do empregado
     */
    Empregado(String cpf, String nome, float salario) {
        this(cpf,nome,salario,null);
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Departamento getDept() {
        return dept;
    }

    public void setDept(Departamento dept) {
        this.dept = dept;
    }

    public String toString() {
        return String.format("Nome: %s, salário: %.2f", nome, salario);
    }
}