import logic.outputs;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        outputs puts = new outputs();
        char choice;
        float userinputs;
        float userinputs2;

    do {
        System.out.print("Enter 1st Number: ");
        userinputs = scanner.nextFloat();

        System.out.print("Enter 2nd Number: ");
        userinputs2 = scanner.nextFloat();
        
        System.out.print("Enter an Operation: + Addition, - Subtraction, * Multiplication, / Division, % Modulus: ");
        char op = scanner.next().charAt(0);

        puts.calculate(userinputs, userinputs2, op);
        System.out.println("Result: " + puts.getResults(userinputs, userinputs2));

        System.out.print("Do you Want to Continue? (Y/N): ");
        choice = scanner.next().charAt(0);
    } while (choice == 'Y' || choice == 'y');

    }
}