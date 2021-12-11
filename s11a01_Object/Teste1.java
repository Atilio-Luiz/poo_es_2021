public class Teste1 {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado("Luiz", 3244.80, 2021, 3, 4);
        Empregado emp2 = new Empregado("Luiz", 3244.80, 2021, 3, 4);
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
    }
}