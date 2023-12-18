import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find its prime factors: ");

        int N = 0;

        while (true) {
            try {
                N = Integer.parseInt(scanner.nextLine());
                if (N > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        scanner.close();

        System.out.print("Prime factors of " + N + ": ");
        computePrimeFactors(N);
    }

    public static void computePrimeFactors(int N) {
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N /= i;
            }
        }

        if (N > 1) {
            System.out.print(N);
        }
    }
}
