public class MathClassDemo {
    public static void main(String[] args) {
        // 1. Absolute value
        double number1 = -15.5;
        System.out.println("1. Absolute value of " + number1 + ": " + Math.abs(number1));

        // 2. Power
        double base = 2.0;
        double exponent = 3.0;
        System.out.println("2. " + base + " raised to the power of " + exponent + ": " + Math.pow(base, exponent));

        // 3. Square root
        double number2 = 25.0;
        System.out.println("3. Square root of " + number2 + ": " + Math.sqrt(number2));

        // 4. Maximum
        int num1 = 10, num2 = 20;
        System.out.println("4. Maximum of " + num1 + " and " + num2 + ": " + Math.max(num1, num2));

        // 5. Minimum
        int num3 = -5, num4 = 8;
        System.out.println("5. Minimum of " + num3 + " and " + num4 + ": " + Math.min(num3, num4));

        // 6. Round
        double number3 = 7.6;
        System.out.println("6. Round value of " + number3 + ": " + Math.round(number3));

        // 7. Floor
        double number4 = 9.3;
        System.out.println("7. Floor value of " + number4 + ": " + Math.floor(number4));

        // 8. Ceil
        double number5 = 4.7;
        System.out.println("8. Ceil value of " + number5 + ": " + Math.ceil(number5));

        // 9. Trigonometric functions
        double angleInRadians = Math.toRadians(45.0);
        System.out.println("9. Sine of 45 degrees: " + Math.sin(angleInRadians));
        System.out.println("   Cosine of 45 degrees: " + Math.cos(angleInRadians));

        // 10. Random
        System.out.println("10. Random number between 0 and 1: " + Math.random());
    }
} 
