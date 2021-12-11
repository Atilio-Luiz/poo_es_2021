public class Gerente extends Empregado3 {
    private double bonus;

    public Gerente(String nome, double salario, int ano, int mes, int dia) {
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
        Gerente gerente = (Gerente) obj;
        return this.bonus == gerente.bonus;
    }
}
