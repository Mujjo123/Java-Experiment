import java.util.Scanner;

public class ArrayMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the arrays
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        // Declare three arrays
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] resultArray = new int[size];

        // Input elements for the first array
        System.out.println("Enter elements for the first array:");
        inputArrayElements(array1);

        // Input elements for the second array
        System.out.println("Enter elements for the second array:");
        inputArrayElements(array2);

        // Multiply the corresponding elements and store in the result array
        for (int i = 0; i < size; i++) {
            resultArray[i] = array1[i] * array2[i];
        }

        // Display the result array
        System.out.println("Resultant Array (Multiplication):");
        displayArrayElements(resultArray);

        scanner.close();
    }

    // Method to input elements for an array
    private static void inputArrayElements(int[] array) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = scanner.nextInt();

        }
        scanner.close();
    }

    // Method to display elements of an array
    private static void displayArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
