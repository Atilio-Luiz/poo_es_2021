public class Car {
    private String registration; // número de registro
    private String make; // fabricante: Ford, Honda, Volkswagen, etc
    private double price; // preço

    public Car(String registration, String make, double price) {
        this.registration = registration;
        this.make = make;
        this.price = price;
    }

    public String getRegistration() {
        return registration;
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Registration: %s, Make: %s, Price: %.2f", 
            getRegistration(), getMake(), getPrice());
    }
}