public class Teste {
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.name);
        System.out.println(p.price);
        System.out.println(p.quantity);
    }
}

class Product {
    String name;
    double price;
    int quantity;
}