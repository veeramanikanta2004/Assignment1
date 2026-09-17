import java.util.Scanner;

public class Assignment10Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 5000;

        while (true) {
            System.out.println("\n1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Amount deposited successfully.");
                        System.out.println("Current balance: ₹" + balance);
                    } else {
                        System.out.println("Error: Deposit amount must be positive.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = scanner.nextDouble();

                    if (withdrawal <= 0) {
                        System.out.println("Error: Withdrawal amount must be positive.");
                    } else if (withdrawal > balance) {
                        System.out.println("Error: Insufficient balance.");
                    } else {
                        balance = balance - withdrawal;
                        System.out.println("Amount withdrawn successfully.");
                        System.out.println("Current balance: ₹" + balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Error: Invalid menu choice.");
            }
        }
    }
}