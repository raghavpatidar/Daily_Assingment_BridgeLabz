import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPerfect = checkPerfectNumber(number);

        if (isPerfect) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }

        scanner.close();
    }

    public static boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1; // Initialize sum with 1 as 1 is always a divisor

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}
