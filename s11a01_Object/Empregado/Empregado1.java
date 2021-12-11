import java.time.LocalDate;

public class Empregado1 {
    private String nome;
    private double salario;
    private LocalDate dataAdmissao;

    public Empregado1(String nome, double salario, int ano, int mes, int dia) {
        this.nome = nome;
        this.salario = salario;
        dataAdmissao = LocalDate.of(ano, mes, dia);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void aumentaSalario(double porcentagem) {
        double aumento = salario * porcentagem / 100;
        salario += aumento;
    }

    @Override
    public String toString() {
        String resultado = getClass().getName();
        resultado += "[nome:" + nome + ", salario:" + salario + 
                        ", data de admissão:" + dataAdmissao + "]";
        return resultado;
    }
}