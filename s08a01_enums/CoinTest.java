enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
    
    private int value; // valor da moeda (em centavos)

    // construtor do enum
    Coin(int v) {
        this.value = v;
    }

    public int getValue() { // getter
        return value;
    }

    public void setValue(int v) { // setter
        this.value = v;
    }
}

public class CoinTest {
    public static void main(String[] args) {
        Coin c = Coin.NICKEL;
        System.out.println(c + " vale " + c.getValue() + " centavos");

        c.setValue(100);
        System.out.println(c + " vale " + c.getValue() + " centavos");
        // Coin d = new Coin(30); // Erro de compilação
    }
    
}