package logic;
import java.util.Scanner;

public class outputs {
    private float results;

    public outputs() {
        results = 0;
    }

    public void add(float a, float b) {
        results = a + b;
    }

    public void subtract(float a, float b) {
        results = a - b;
    }

    public void multiply(float a, float b) {
        results = a * b;
    }

    public void divide(float a, float b) {
        if (b != 0) {
            results = a / b;
        } else {
            System.out.println("Error Cannot Divide by Zero");
        }
    }

    public void modulus(float a, float b) {
        results = a % b;
    }

    // Get Results;
    public float getResults(float a, float b) {
        return results;
    }

    // Reset Results
    public void reset (float a, float b) {
        results = 0;
    }

    public void calculate(float a, float b, char operator) {
        switch (operator){
            case '+':
                add(a, b);
                break;

            case '-':
                subtract(a, b);
                break;

            case '*':
                multiply(a, b);
                break;

            case '/':
                divide(a, b);
                break;

            case '%':
                modulus(a, b);
                break;

            default:
                System.out.println("Invalid Operator, Pick One From the List!");
                break;

        }

    }

}

