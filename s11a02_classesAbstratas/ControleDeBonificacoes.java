public class ControleDeBonificacoes {
    private double totalDeBonificacoes = 0;

    public void registra(Funcionario f) {
        System.out.println("Adicionando bonificação de funcionário: " + f);
        this.totalDeBonificacoes += f.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return this.totalDeBonificacoes;
    }
}