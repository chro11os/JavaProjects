import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        float x,y;
        char operator;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        x = scanner.nextFloat();
        System.out.print("Enter 2nd Number: ");
        y = scanner.nextFloat();

        System.out.print("Pick an operator. 1 Addition, 2 Subtraction, 3 Multiplication, 4 Division, 5 Modulo: ");
        operator = scanner.next().charAt(0);
        scanner.close();

            switch (operator) {
                case '1':
                    System.out.println(x + y);
                    break;

                case '2':
                    System.out.println(x - y);
                    break;

                case '3':
                    System.out.println(x * y);
                    break;

                case '4':
                    if (y != 0) {
                        System.out.println(x / y);
                    } else {
                        System.out.println("Division by zero, is not allowed");
                    }
                    break;

                case '5':
                    System.out.println(x % y);
                    break;

                default:
                    System.out.println("Invalid Operator");
                    break;
            }


    }
}