import java.util.Objects;

public class Gerente4 extends Empregado4 {
    private double bonus;

    public Gerente4(String nome, double salario, int ano, int mes, int dia) {
        super(nome, salario, ano, mes, dia);
        bonus = 0.0;
    }

    @Override
    public double getSalario() {
        double salarioBase = super.getSalario();
        return salarioBase + bonus;
    }

    public void setBonus(double b) {
        if(b < 0)
            throw new IllegalArgumentException("bonus nao pode ser negativo");
        bonus = b;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) return false;

        // super.equals checou que obj pertence
        // à classe Gerente
        Gerente4 gerente = (Gerente4) obj;
        return bonus == gerente.bonus;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hashCode(bonus);
    }
}
