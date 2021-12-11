/**
 * Interface Conta que encapsula três dos
 * métodos essenciais de uma conta bancária
 */
public interface Conta {
    void depositar (double valor);
    void sacar (double valor);
    double getSaldo();
}
