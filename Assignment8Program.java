import java.util.Scanner;

public class Assignment8Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Enter a positive integer.");
        } else {
            int originalNumber = number;
            int digitCount = 0;
            int sum = 0;
            int reversedNumber = 0;

            while (number > 0) {
                int digit = number % 10;

                sum = sum + digit;
                reversedNumber = reversedNumber * 10 + digit;
                digitCount++;

                number = number / 10;
            }

            System.out.println("Number of digits: " + digitCount);
            System.out.println("Sum of digits: " + sum);
            System.out.println("Reversed number: " + reversedNumber);
        }

        scanner.close();
    }
}