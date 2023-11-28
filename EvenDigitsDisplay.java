public class EvenDigitsDisplay {
    public static void main(String[] args) {
        // Check if a command-line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide an integer number as a command-line argument.");
            return;
        }

        // Extract the number from the command-line argument
        int number;
        try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer number.");
            return;
        }

        // Display only the even digits from the number
        System.out.println("Original Number: " + number);
        System.out.print("Even Digits: ");
        displayEvenDigits(number);
    }

    // Method to display even digits from a number
    private static void displayEvenDigits(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                System.out.print(digit + " ");
            }
            number /= 10;
        }
        System.out.println();
    }
}
