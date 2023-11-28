import java.util.Scanner;

public class Bankprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0.0;

        int choice;
        do {
            System.out.println("\nBank Operations: \n1. Deposit Money\n2. Withdraw Moeny \n3. Display Balance \n4. Exit \nEnter your choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposit successful. Current balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    balance-=withdrawAmount;
                   /*  if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. Current balance: " + balance);
                    } else {
                        System.out.println("Insufficient funds. Cannot withdraw.");
                    }*/
                    break;
                case 3:
                    System.out.println("Current Balance: " + balance);
                    break;
                case 4:
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
