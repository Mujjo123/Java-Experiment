class College {
    // Function to display information of a student
    void displayInfo(String studentName, int rollNumber) {
        System.out.println("Student Information:");
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
    }

    // Overloaded function to display information of a faculty
    void displayInfo(String facultyName, String department) {
        System.out.println("\nFaculty Information:");
        System.out.println("Name: " + facultyName);
        System.out.println("Department: " + department);
    }
}

public class InfoDisplay {
    public static void main(String[] args) {
        College college = new College();

        // Display student information
        college.displayInfo("John Doe", 101);

        // Display faculty information
        college.displayInfo("Dr. Smith", "Computer Science");
    }
}
