import java.util.Scanner;

public class Assignment2Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (first == second && second == third) {
            System.out.println("All numbers are equal.");
        } else if (first >= second && first >= third) {
            System.out.println(first + " is the largest number.");
        } else if (second >= first && second >= third) {
            System.out.println(second + " is the largest number.");
        } else {
            System.out.println(third + " is the largest number.");
        }

        scanner.close();
    }
}