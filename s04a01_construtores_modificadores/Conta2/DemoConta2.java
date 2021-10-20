public class DemoConta2 {
    public static void main(String[] args) {
        Conta2 contaAna = new Conta2(234567, "Ana Almeida", 2367.98); 
        Conta2 contaJosé = new Conta2(234568, "José Linhares");
        
        contaAna.mostraConta();
        contaJosé.mostraConta();
        
        contaJosé.deposita(500.00);
        contaJosé.mostraConta();
        
        if(contaAna.saca(3000.00)) {
            System.out.println("Saque bem-sucedido:");
            contaAna.mostraConta();
        }
        else {
            System.out.println(contaAna.getTitular() + 
                ", não foi possível realizar o saque.");
        }
        
        System.out.println(contaAna);
        System.out.println(contaJosé);
        
    }
}