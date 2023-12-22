import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Stopwatch Program");
        System.out.println("1. Start the Stopwatch");
        System.out.println("2. End the Stopwatch");
        System.out.println("3. Exit");

        int choice;
        long startTime = 0;
        long endTime = 0;

        do {
            System.out.print("Enter your choice (1/2/3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    startTime = System.currentTimeMillis();
                    System.out.println("Stopwatch started at " + startTime + " milliseconds.");
                    break;

                case 2:
                    if (startTime == 0) {
                        System.out.println("Please start the stopwatch first.");
                    } else {
                        endTime = System.currentTimeMillis();
                        System.out.println("Stopwatch stopped at " + endTime + " milliseconds.");
                        long elapsedTime = endTime - startTime;
                        System.out.println("Elapsed time: " + elapsedTime + " milliseconds.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }

        } while (choice != 3);

        scanner.close();
    }
}
