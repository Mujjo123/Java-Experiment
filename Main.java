import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;

    public void inputStudentData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter student roll number: ");
        this.rollNumber = scanner.nextInt();

        scanner.close();
    }

    public void displayStudentData() {
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.inputStudentData();

        student1.displayStudentData();
    }
}
