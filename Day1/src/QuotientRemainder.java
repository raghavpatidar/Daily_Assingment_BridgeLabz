import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check if the divisor is not zero
        if (divisor != 0) {
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
        }

        scanner.close();
    }
}
