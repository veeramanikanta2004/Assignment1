import java.util.Scanner;

public class Assignment9Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Enter a positive integer.");
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0) {
                    continue;
                }

                System.out.print(i + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}