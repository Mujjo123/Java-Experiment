import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get numerator and denominator from the user
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            double result = divide(numerator, denominator);

            // Display the result
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the scanner in the finally block to ensure it is always closed
            scanner.close();
        }
    }

    // Method to perform division
    private static double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) numerator / denominator;
    }
}
