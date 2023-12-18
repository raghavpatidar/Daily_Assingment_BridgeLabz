import java.util.Scanner;

public class LYC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year (4-digit): ");
        int y = 0;
        while (true) {
            try {
                y = Integer.parseInt(sc.nextLine());
                if (y >= 1000 && y <= 9999) {
                    break;
                } else {
                    System.out.println("Please enter a 4-digit year.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a 4-digit year.");
            }
        }
        sc.close();
        boolean l = checkLY(y);
        if (l) {
            System.out.println(y + " is a leap year.");
        } else {
            System.out.println(y + " is not a leap year.");
        }
    }

    public static boolean checkLY(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}
