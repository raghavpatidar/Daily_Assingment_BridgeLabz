import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        // Get user input for the number of times to flip the coin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of times to flip the coin: ");

        int numberOfFlips = 0;
        // Ensure the input is a positive integer
        while (true) {
            try {
                numberOfFlips = Integer.parseInt(scanner.nextLine());
                if (numberOfFlips > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }

        scanner.close();

        // Perform the coin flips and calculate the percentage of heads and tails
        int headsCount = 0;
        int tailsCount = 0;

        Random random = new Random();
        for (int i = 0; i < numberOfFlips; i++) {
            // Use Random.nextDouble() to get a random value between 0 and 1
            if (random.nextDouble() < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }

        // Calculate percentages
        double headsPercentage = (double) headsCount / numberOfFlips * 100;
        double tailsPercentage = (double) tailsCount / numberOfFlips * 100;

        // Print the results
        System.out.println("Number of flips: " + numberOfFlips);
        System.out.println("Heads count: " + headsCount + " (" + headsPercentage + "%)");
        System.out.println("Tails count: " + tailsCount + " (" + tailsPercentage + "%)");
    }
}
