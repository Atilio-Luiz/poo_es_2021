public class ProtectedConstructorTeste {
    public static void main(String[] args) {
        Animal lobo = new Animal("lobo");
        System.out.println(lobo);
    }
}

class Animal {
    String nome;

    protected Animal(String nome) {
        this.nome = nome;
    }
}