import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class TextFileTester {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char choice;

        // create an empty List to hold Cars
        List<Car> carList = new ArrayList<>();

        // read the list from file when the program starts
        readList(carList);

        // menu options
        do {
            System.out.println("\nText File Tester");
            System.out.println("1. Add a car");
            System.out.println("2. Remove a car");
            System.out.println("3. List all cars");
            System.out.println("4. Quit");
            System.out.print("Entre your choice: ");
            choice = sc.next().charAt(0);
            
            switch(choice) {
                case '1': addCar(carList); break;
                case '2': removeCar(carList); break;
                case '3': listAll(carList); break;
                case '4': writeList(carList); break; // write to the file
                default : System.out.print("\nPlease choose a number from 1-4 only\n");
            }
        } while(choice != '4');
    }

    // method to add a new car to the List
    static void addCar(List<Car> carListIn) {
        String tempReg;
        String tempMake;
        double tempPrice;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the registration number: ");
        tempReg = sc.next();
        System.out.print("Please enter the make: ");
        tempMake = sc.next();
        System.out.print("Please enter the price: ");
        tempPrice = sc.nextDouble();
        carListIn.add(new Car(tempReg, tempMake, tempPrice));
    }

    // method for removing a car from the list 
    static void removeCar(List<Car> carListIn) {
        int pos;
        System.out.print("Enter the position of the car to be removed: ");
        Scanner sc = new Scanner(System.in);
        pos = sc.nextInt();
        carListIn.remove(pos-1);
    }

    // method for listing details of all cars in the list
    static void listAll(List<Car> carListIn) {
        for(Car item : carListIn) {
            System.out.println(item);
        }
    }

    // method for writing the file
    static void writeList(List<Car> carListIn) {
        // use try-with-resources to ensure file is closed safely
        try (
                /* create a FileWriter object, carFile, that handles
                the low-level details of writing the list to a file 
                which we have called "Cars.txt" */
                FileWriter carFile = new FileWriter("Cars.txt");
                /* now create a PrintWriter object to wrap around carFile;
                this allows us to user high-level functions such as println */
                PrintWriter carWriter = new PrintWriter(carFile);
            )
        {
            // write each element of the list to the file
            for(Car item : carListIn) {
                carWriter.println(item.getRegistration());
                carWriter.println(item.getMake());
                carWriter.println(item.getPrice()); // println can accept a double
                                                    // and write it as a String
            }
        }
        catch(IOException e) {
            System.out.println("There was a problem writing the file");
        }
    }

    // method for reading the file
    static void readList(List<Car> carListIn) {

        /* create a File object that handles the low-level 
        details of reading the list from the "Cars.txt" file */
        File carFile = new File("Cars.txt");

        // use try-with-resources to ensure file is closed safely
        try (
                /* now create a Scanner object to wrap around carFile
                this allows us to user high-level functions such as nextLine */
                Scanner carStream = new Scanner(carFile);
            )
        {
            while(carStream.hasNext()) { 
                String tempReg = carStream.nextLine();
                String tempMake = carStream.nextLine();
                double tempPrice = carStream.nextDouble();
                carListIn.add(new Car(tempReg, tempMake, tempPrice));
                carStream.nextLine(); // clear buffer before next readLine
            }
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid Input");
        }
        catch(FileNotFoundException e) {
            System.out.println("\nerror: No file was read");
        }
    }
}
