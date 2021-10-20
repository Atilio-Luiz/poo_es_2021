class Conta {
    private int numero;
    private String titular;
    private double saldo;

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
    public boolean transfere(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if(retirou == false) {
            return false; // não deu para sacar
        }
        else {
            destino.deposita(valor);
            return true;
        }
    }

    public String getNumero() { // getter
        return numero;
    }

    //public void setNumero(double numero) { // setter
    //    this.numero = numero;
    //}

    public String getTitular() { // getter
        return titular;
    }

    //public void setTitular(String titular) { // setter
    //    this.titular = titular;
    //}

    public double getSaldo() { // getter
        return saldo;
    }

    //public void setSaldo(double saldo) { // setter
    //    this.saldo = saldo;
    //}  
}