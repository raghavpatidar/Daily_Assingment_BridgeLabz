import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Harmonic Value N (ensure N != 0): ");

        int N = 0;

        while (true) {
            try {
                N = Integer.parseInt(scanner.nextLine());
                if (N != 0) {
                    break;
                } else {
                    System.out.println("Please enter a value for N that is not 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer for N.");
            }
        }

        scanner.close();

        double harmonicValue = computeHarmonicNumber(N);
        System.out.println("The " + N + "th Harmonic Value is: " + harmonicValue);
    }

    public static double computeHarmonicNumber(int N) {
        double harmonicValue = 0.0;

        for (int i = 1; i <= N; i++) {
            harmonicValue += 1.0 / i;
        }

        return harmonicValue;
    }
}
