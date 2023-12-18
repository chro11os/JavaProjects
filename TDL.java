import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TDL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> todoList = new ArrayList<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("1. Add a new to-do item.");
            System.out.println("2. View to-do list.");
            System.out.println("3. Delete the entire to-do list.");
            System.out.println("4. Exit.");
            System.out.print("Enter Choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": {
                    System.out.println("Input 'to do': ");
                    String newItem = scanner.nextLine();
                    todoList.add(newItem);
                    System.out.println("To-do item added successfully!");
                    break;
                }

                case "2": {
                    if (todoList.isEmpty()) {
                        System.out.println("The to-do list is empty.");
                    } else {
                        System.out.println("TODO LIST:");
                        for (String item : todoList) {
                            System.out.println(item);
                        }
                    }
                    break;
                }

                case "3": {
                    todoList.clear();
                    System.out.println("The entire to-do list has been deleted.");
                    break;
                }

                case "4":
                    exit = true;
                    break;

                default: {
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
                }
            }
        }

        // Close the scanner outside the loop
        scanner.close();
    }
}
