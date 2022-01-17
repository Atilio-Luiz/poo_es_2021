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
            System.out.println("3. Update a car");
            System.out.println("4. List all cars");
            System.out.println("5. Quit");
            System.out.print("Entre your choice: ");
            choice = sc.next().charAt(0);
            
            switch(choice) {
                case '1': addCar(); break;
                case '2': displayCar(); break;
                case '3': updateCar(); break;
                case '4': listAllCars(); break;
                case '5': break;
                default : System.out.print("\nChoose 1 - 5 only please\n");
            }
        } while(choice != '5');
    }

    static Car readCar() {
        String tempReg;
        String tempMake;
        double tempPrice;
          
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.print("Please enter the registration number: ");
                tempReg = sc.next();
                if(tempReg.length() > 10) {
                    throw new InputMismatchException(
                        "Registration must have at most 10 characters");
                }
                // pad the string with spaces to make it exactly 10 caracters long
                for(int i = tempReg.length() + 1; i <= 10; i++) {
                    tempReg = tempReg.concat(" ");
                }

                // get the make of the car from the user
                System.out.print("Please enter the make: ");
                tempMake = sc.next();
                // limit the make number to 10 characters
                if(tempMake.length() > 10) {
                    throw new InputMismatchException(
                        "Make must have at most 10 characters");
                }
                // pad the string with spaces to make it exactly 10 caracters long
                for(int i = tempMake.length() + 1; i <= 10; i++) {
                    tempMake = tempMake.concat(" ");
                }

                // get the price of the car from the user
                System.out.print("Please enter the price: ");
                tempPrice = sc.nextDouble();

                Car car = new Car(tempReg, tempMake, tempPrice);
                return car;
            }
            catch(InputMismatchException e) {
                System.out.println("error on the reading: " + e.getMessage());
                System.out.println("Let us try everything again.");
                sc.nextLine(); // limpa o buffer
            }
        } while(true);
    }

    // method to add a new car
    static void addCar() {
        writeRecord(readCar());
    }

    // method to update an existing car
    static void updateCar() {
        Scanner sc = new Scanner(System.in);
        int pos;
        System.out.print("Enter the car's position in the list: ");
        pos = sc.nextInt();
        updateRecord(pos);
    }

    static void displayCar() {
        int pos;
        Scanner sc = new Scanner(System.in);
        // get the position of the item to be read from the user
        System.out.print("Enter the car's position in the list: ");
        pos = sc.nextInt();
        Car tempCar = readRecord(pos);
        if(tempCar != null) {
            System.out.printf("%s %s %.2f%n", 
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

    static void updateRecord(int pos) {
        // use try-with-resources to ensure file is closed safely 
        try (
                // open a RandomAccessFile in read-write mode
                RandomAccessFile carFile = new RandomAccessFile("cars.rand", "rw");
            )
        {
            // mode the pointer to the start of the required record
            carFile.seek((pos-1) * CAR_SIZE);

            System.out.println("Enter new values for the car:");
            Car tempCar = readCar();
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

    // method for reading the file
    static void listAllCars() {
        // use try-with-resources to ensure file is closed safely
        try (
                // open a RandomAccessFile in read-only mode
                RandomAccessFile carFile = new RandomAccessFile("cars.rand", "r");
            )
        {
            System.out.printf("%n%-10s%-14s%-12s%-17s%n", "Position", 
                "Registration", "Make", "Price");
            int count = 1;
            while(carFile.getFilePointer() != carFile.length()) { 
                String tempReg = carFile.readUTF();
                String tempMake = carFile.readUTF();
                double tempPrice = carFile.readDouble();
                System.out.printf("%-10d%-14s%-12s%-17.2f%n",
                    (count++), tempReg.trim(), tempMake.trim(), tempPrice);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("\nerror: No file was read");
        }
        catch(IOException e) {
            System.out.println("\nerror: There was a problem reading the file");
        }
    }
}
