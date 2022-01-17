import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
    private String name;
    private int id;
    private LocalDate admissionDate; 
    private double salary;

    public Employee(String name, int id, short y, byte m, byte d) {
        this.name = name;
        this.id = id;
        admissionDate = LocalDate.of(y, m, d);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }  
    
    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double value) {
        this.salary += value;
    }

    @Override
    public String toString() {
        String result = "\nName: " + name + 
                        "\nID: " + id +
                        "\nAdmission date: " + admissionDate;
        return result;
    }
}