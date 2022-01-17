import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var ana = new Employee("Ana Martins", 5000, (short)1989, (byte)10, (byte)1);
        var lucia = new Manager("Lucia Sousa", 8000, (short)1987, (byte)12, (byte)15);
        var bia = new Manager("Bianca Gomes", 7000, (short)1990, (byte)3, (byte)15);
        lucia.setSecretary(ana);
        bia.setSecretary(ana);

        var staff = new Employee[3];

        staff[0] = ana;
        staff[1] = lucia;
        staff[2] = bia;

        // save all Employee records to the file employee.dat
        try (
                var out = new ObjectOutputStream(new FileOutputStream("employee.dat"));
            )
        {
            out.writeObject(staff);
        }

        try (
                var in = new ObjectInputStream(new FileInputStream("employee.dat"))
            )
        {
            // retrieve all records into a new array
            var newStaff = (Employee[]) in.readObject();

            // raise secretary's salary
            newStaff[1].raiseSalary(10);

            // print the newly read employee records
            for (Employee e : newStaff) {
                System.out.println(e);
            }
        }
    }
}
