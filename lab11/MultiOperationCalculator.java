import java.util.Scanner;

public class MultiOperationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Choose an operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            double result;

            switch (operation) {
                case '+' -> {
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                }
                case '-' -> {
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                }
                case '*' -> {
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                }
                case '/' -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
                default -> System.out.println("Invalid operation.");
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("no")) {
                running = false;
                System.out.println("Calculator is closing. Goodbye!");
            }
        }

        scanner.close();
    }
}