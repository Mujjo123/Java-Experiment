public class EvenNumbersSum {
    public static void main(String[] args) {
        // Check if command-line arguments are provided
        if (args.length == 0) {
            System.out.println("Please provide integer numbers as command-line arguments.");
            return;
        }

        // Initialize the sum
        int sum = 0;

        // Loop through command-line arguments and add even numbers to the sum
        for (String arg : args) {
            if (isInteger(arg)) {
                int number = Integer.parseInt(arg);
                if (number % 2 == 0) {
                    sum += number;
                }
            } else {
                System.out.println("Invalid input: " + arg + " (not an integer).");
            }
        }

        // Display the sum of even numbers
        System.out.println("Sum of Even Numbers: " + sum);
    }

    // Method to check if a string is a valid integer
    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
