import java.util.Scanner;

public class CandidateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store birth dates (format: [day, month, year])
        int[][] birthDates = new int[3][3];

        // Array to store candidate names
        String[] candidateNames = new String[3];

        // Input birth dates and candidate names
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Candidate " + (i + 1) + ":");
            System.out.print("Enter name: ");
            candidateNames[i] = scanner.nextLine();

            System.out.print("Enter day of birth: ");
            birthDates[i][0] = scanner.nextInt();

            System.out.print("Enter month of birth: ");
            birthDates[i][1] = scanner.nextInt();

            System.out.print("Enter year of birth: ");
            birthDates[i][2] = scanner.nextInt();

            // Consume the newline character left in the buffer
            scanner.nextLine();
        }

        // Find the candidate with the least age
        int minAgeIndex = findCandidateWithMinAge(birthDates);

        // Display the name of the person with less age
        System.out.println("\nPerson with less age:");
        System.out.println("Name: " + candidateNames[minAgeIndex]);

        scanner.close();
    }

    // Method to find the candidate with the least age
    private static int findCandidateWithMinAge(int[][] birthDates) {
        int minAgeIndex = 0;
        for (int i = 1; i < birthDates.length; i++) {
            if (calculateAge(birthDates[i]) < calculateAge(birthDates[minAgeIndex])) {
                minAgeIndex = i;
            }
        }
        return minAgeIndex;
    }

    // Method to calculate age based on birth date
    private static int calculateAge(int[] birthDate) {
        // Assuming the current date for age calculation
        int currentDay = 1;
        int currentMonth = 1;
        int currentYear = 2023;

        int birthDay = birthDate[0];
        int birthMonth = birthDate[1];
        int birthYear = birthDate[2];

        int age = currentYear - birthYear;

        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        return age;
    }
}
