import java.util.ArrayList;
import java.util.Scanner;

public class StockAccountManagement {

    public static void main(String[] args) throws Exception {
        StockPorfolio stockPorfolio = new StockPorfolio();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Stock Account Management");

        System.out.print("Enter number of stocks : ");
        int numOfStocks = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numOfStocks; i++) {
            stockPorfolio.addStock(getStckInput(scanner));
        }
        scanner.close();
    }

    public static Stock getStckInput(Scanner scanner) {
        System.out.print("Enter share name : ");
        String name = scanner.nextLine();

        System.out.print("Enter Number of Share : ");
        int qty = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Share Price : ");
        int price = scanner.nextInt();
        scanner.nextLine();

        return new Stock(name, qty, price);
    }
}
