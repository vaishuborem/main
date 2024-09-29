import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Perform the calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Handle division by zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit the program
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return; // Exit the program
        }

        // Display the result
        System.out.println("Result: " + result);
    }
}
