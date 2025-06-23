import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division with divide-by-zero handling
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return Double.NaN; // Not a Number
        }
        if (Math.abs(b) > Math.abs(a) && a != 0) {
            System.out.printf("Note: Dividing %.2f by %.2f will result in a decimal less than 1%n", a, b);
        }
        return a / b;
    }

    // Method to display menu
    public static void displayMenu() {
        System.out.println("\n=== Java Console Calculator ===");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
        System.out.print("Choose an operation (1-5): ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println("Welcome to Java Console Calculator!");

        // Main loop for multiple calculations
        while (continueCalculation) {
            displayMenu();

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using the calculator. Goodbye!");
                continueCalculation = false;
                continue;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please select 1-5.");
                continue;
            }

            // Get numbers from user
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            String operation = "";

            // Perform calculation based on choice
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    operation = "+";
                    break;
                case 2:
                    result = subtract(num1, num2);
                    operation = "-";
                    break;
                case 3:
                    result = multiply(num1, num2);
                    operation = "*";
                    break;
                case 4:
                    result = divide(num1, num2);
                    operation = "/";
                    break;
            }

            // Display result if division didn't result in error
            if (!Double.isNaN(result)) {
                if (result < 1.0 && result > 0) {
                    System.out.printf("Result: %.2f %s %.2f = %.4f%n",
                            num1, operation, num2, result);
                } else {
                    System.out.printf("Result: %.2f %s %.2f = %.2f%n",
                            num1, operation, num2, result);
                }
            }

            // Ask if user wants to continue
            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            String continueChoice = scanner.next().toLowerCase();

            if (!continueChoice.equals("y") && !continueChoice.equals("yes")) {
                continueCalculation = false;
                System.out.println("Thank you for using the calculator. Goodbye!");
            }
        }
        scanner.close();
    }
}