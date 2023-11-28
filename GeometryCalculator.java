import java.util.Scanner;

public class GeometryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double circleArea = calculateCircleArea(radius);
        double circlePerimeter = calculateCirclePerimeter(radius);

        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Perimeter of the circle: " + circlePerimeter);

        
        System.out.print("\nEnter the base length of the triangle: ");
        double baseLength = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double triangleArea = calculateTriangleArea(baseLength, height);

        System.out.println("Area of the triangle: " + triangleArea);

        scanner.close();
    }

    
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

   
    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
