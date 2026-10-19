import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Simple Java Calculator ===");
        
        // Take the first number as input
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Take the arithmetic operator as input
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        // Take the second number as input
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        boolean validOperation = true;
        
        // Switch block to evaluate the selected operation
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
                // Handle division by zero scenario
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                    validOperation = false;
                    result = 0;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Error! Invalid operator entered.");
                validOperation = false;
                result = 0;
                break;
        }
        
        // Display the final output if the operation was valid
        if (validOperation) {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
        
        // Close the scanner resource
        scanner.close();
    }
}
