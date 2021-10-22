/**
 * A classe Conta3 modela uma conta bancária simplificada.
 */
public class Conta3 {
    private int numero;
    private String titular;
    private double saldo;

    /**
     * Construtor que recebe três argumentos. 
     * Quando o objeto do tipo Conta2 for instanciado com um inteiro, 
     * uma String e um double passados por parâmetro, esse construtor será executado.
     * @param numero número da conta
     * @param titular nome do titular da conta
     * @param saldo saldo da conta
     */
    Conta3(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    /**
     * Construtor que recebe dois argumentos. 
     * Quando o objeto do tipo Conta2 for instanciado com um inteiro e 
     * uma String passados por parâmetro, esse construtor será executado.
     * @param numero número da conta
     * @param titular nome do titular da conta
     */
    Conta3(int numero, String titular) {
        this(numero, titular, 0.0); // invoca o construtor com três parâmetros
    }

    public int getNumero() { // getter
        return numero;
    }

    public double getSaldo() { // getter
        return saldo;
    }

    public String getTitular() { // getter
        return titular;
    }

    /**
     * Método para sacar uma quantia da conta.
     * @param valor o valor a ser sacado da conta
     * @return true se o saque for bem-sucedido, false caso contrário
     */
    public boolean saca(double valor) {
        if(valor >= 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        else return false;
    }

    /**
     * Método usado para depositar uma quantia na conta.
     * Antes de depositar, verifica se o valor é não-negativo.
     * @param valor quantia a ser depositada na conta
     * @return true se o depósito for bem-sucedido, false caso contrário
     */
    public boolean deposita(double valor) {
        if(valor >= 0) {
            this.saldo += valor;
            return true;
        }
        else return false;
    }

    /**
     * Método que transfere uma quantia desta conta para outra
     * Antes de transferir, verifica se a conta possui a 
     * quantidade a ser transferida disponível.
     * @param destino conta para a qual a quantia deve ser transferida
     * @param valor quantia a ser transferida
     * @return true se a transferência for bem sucedida, false caso contrário
     */
    public boolean transfere(Conta3 destino, double valor) {
        boolean retirou = this.saca(valor);
        if(retirou == false) {
            return false; // não deu para sacar
        }
        else {
            destino.deposita(valor);
            return true;
        }
    }
    
    /**
     * Método toString sobrescrito.
     * @return uma string com a descrição do objeto
     */
    public String toString() {
        String output = "Conta[" + 
            "número:" + numero + "," +
            "Titular:" + titular + "," + 
            "Saldo:" + saldo + "]";
        return output;
    }
}