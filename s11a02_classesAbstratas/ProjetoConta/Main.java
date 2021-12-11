public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1200);
        cc.sacar(300);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(1400);
        cp.sacar(400);

        GeradorExtrato gerador = new GeradorExtrato();
        gerador.geradorConta(cc);
        gerador.geradorConta(cp);
    }
}
