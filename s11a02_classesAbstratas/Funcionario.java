public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario() {}

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double getBonificacao() {
        return this.salario * 1.2;
    }

    @Override
    public String toString() {
        return String.format("nome: %s, CPF:%s", nome, cpf);
    }
}