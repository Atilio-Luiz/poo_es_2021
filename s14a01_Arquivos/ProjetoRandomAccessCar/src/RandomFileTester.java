import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;

public class RandomFileTester {

    static final int CAR_SIZE = 32; // each record will be 32 bytes 

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char choice;
        do {
            System.out.println("\nRandom File Tester");
            System.out.println("1. Add a car");
            System.out.println("2. Display a car");
            System.out.println("3. Quit");
            System.out.print("Entre your choice: ");
            choice = sc.next().charAt(0);
            
            switch(choice) {
                case '1': addCar(); break;
                case '2': displayCar(); break;
                case '3': break;
                default : System.out.print("\nChoose 1 - 3 only please\n");
            }
        } while(choice != '3');
    }

    static void addCar() {
          
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.print("Please enter the registration number: ");
                StringBuilder tempReg = new StringBuilder( sc.next() );
                if(tempReg.length() > 10) {
                    throw new InputMismatchException(
                        "Registration must have at most 10 characters");
                }
                // pad the string with spaces to make it exactly 10 caracters long
                for(int i = tempReg.length() + 1; i <= 10; i++) {
                    tempReg.append(" ");
                }

                // get the make of the car from the user
                System.out.print("Please enter the make: ");
                StringBuilder tempMake = new StringBuilder( sc.next() );
                // limit the make number to 10 characters
                if(tempMake.length() > 10) {
                    throw new InputMismatchException(
                        "Make must have at most 10 characters");
                }
                // pad the string with spaces to make it exactly 10 caracters long
                for(int i = tempMake.length() + 1; i <= 10; i++) {
                    tempMake.append(" ");
                }

                // get the price of the car from the user
                System.out.print("Please enter the price: ");
                double tempPrice = sc.nextDouble();

                writeRecord( new Car(tempReg.toString(), tempMake.toString(), tempPrice) );
                break;

            }
            catch(InputMismatchException e) {
                System.out.println("error on the reading: " + e.getMessage());
                System.out.println("Let us try everything again.");
                sc.nextLine(); // limpa o buffer
            }
        } while(true);
    }

    static void displayCar() {
        int pos;
        Scanner sc = new Scanner(System.in);
        // get the position of the item to be read from the user
        System.out.print("Enter the car's position in the list: ");
        pos = sc.nextInt();
        Car tempCar = readRecord(pos);
        if(tempCar != null) {
            System.out.printf("Registration: %s, Make: %s, Price: %.2f%n", 
                tempCar.getRegistration().trim(),
                tempCar.getMake().trim(), 
                tempCar.getPrice());
        }
        else {
            System.out.println("Invalid Position");
        }
    }

    static void writeRecord(Car tempCar) {
        // use try-with-resources to ensure file is closed safely 
        try (
                // open a RandomAccessFile in read-write mode
                RandomAccessFile carFile = new RandomAccessFile("cars.rand", "rw");
            )
        {
            // mode the pointer to the end of the file
            carFile.seek(carFile.length());
            // write the three fields of the record to the file
            carFile.writeUTF(tempCar.getRegistration());
            carFile.writeUTF(tempCar.getMake());
            carFile.writeDouble(tempCar.getPrice());
        }
        catch(IOException e) {
            System.out.println("There was a problem writing the file");
        }
    }

    // method for reading the file
    static Car readRecord(int pos) {
        String tempReg;
        String tempMake;
        double tempPrice;
        Car tempCar = null; // a null value is returned if there 
                            // is a problem reading the record;

        // use try-with-resources to ensure file is closed safely
        try (
                // open a RandomAccessFile in read-only mode
                RandomAccessFile carFile = new RandomAccessFile("cars.rand", "r");
            )
        {
            // mode the pointer to the start of the required record
            carFile.seek((pos-1) * CAR_SIZE);

            // read the three fields of the record from the file
            tempReg = carFile.readUTF();
            tempMake = carFile.readUTF();
            tempPrice = carFile.readDouble();
            // use the data just read to create a new car object
            tempCar = new Car(tempReg, tempMake, tempPrice);
        }
        catch(FileNotFoundException e) {
            System.out.println("\nerror: No file was read");
        }
        catch(IOException e) {
            System.out.println("\nerror: There was a problem reading the file");
        }
        // return the record that was read
        return tempCar;
    }
}
