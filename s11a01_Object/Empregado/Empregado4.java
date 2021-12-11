import java.time.LocalDate;
import java.util.Objects;

public class Empregado4 {
    private String nome;
    private double salario;
    private LocalDate dataAdmissao;

    public Empregado4(String nome, double salario, int ano, int mes, int dia) {
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

    @Override
    public boolean equals(Object obj) {
        // um teste para ver se os objetos são idênticos
        if(this == obj) return true; 
        // retorna se false se o argumento é nulo
        if(obj == null) return false;
        // se as classes não casam, não podem ser iguais
        if(getClass() != obj.getClass()) return false;
        // agora, sabemos que obj é um Empregado não-nulo
        Empregado4 p = (Empregado4) obj;
        // checa se os estados dos objetos são idênticos
        return Objects.equals(nome, p.nome)
            && salario == p.salario
            && Objects.equals(dataAdmissao, p.dataAdmissao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome) + 
               Objects.hashCode(salario) + 
               Objects.hashCode(dataAdmissao);
    }
}
