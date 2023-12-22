import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();
        int[] fibonacciSeries = generateFibonacci(n);
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries[i] + " ");
        }
        scanner.close();
    }

    public static int[] generateFibonacci(int n) {
        int[] fibSeries = new int[n];
        fibSeries[0] = 0;
        fibSeries[1] = 1;

        for (int i = 2; i < n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
        }

        return fibSeries;
    }
}
