import org.MainPackage.NameData;
import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    NameData nameDataInstance = new NameData();

    while (true) {
        System.out.println("Enter first name (or 'exit' to quit):");
        String firstName = scanner.nextLine();
        if (firstName.equalsIgnoreCase("exit")) {
            break;
        }

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        // Adding new input to the array
        nameDataInstance.inputData(firstName, lastName);

        // Display the updated array
        nameDataInstance.printData();
    }

    scanner.close();
}