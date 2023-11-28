import java.util.Scanner;

public class Numberoperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter an integer: ");
        int integerNumber = scanner.nextInt();

        System.out.print("Enter a float number: ");
        float floatNumber = scanner.nextFloat();

        System.out.println("\nFor the integer " + integerNumber + ":");
        displaySquareAndCube(integerNumber);

        System.out.println("\nFor the float number " + floatNumber + ":");
        displaySquareAndCube(floatNumber);

       scanner.close();
    }

    public static void displaySquareAndCube(int number) {
        int square = number * number;
        int cube = number * number * number;

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
    }

    public static void displaySquareAndCube(float number) {
        float square = number * number;
        float cube = number * number * number;

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
    }
}
