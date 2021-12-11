import java.util.Locale;

public class GeradorExtrato {
    public void geradorConta (Conta conta) {
        Locale.setDefault(Locale.US);
        System.out.printf("Saldo atual: %.2f%n", conta.getSaldo()); // ufa!!
    }
}
