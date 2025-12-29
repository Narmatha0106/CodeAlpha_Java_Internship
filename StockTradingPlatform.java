import java.util.*;

public class StockTradingPlatform {
    static int shares = 0;
    static double balance = 100000;
    static double stockPrice = 500;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n___STOCK TRADING PLATFORM____");
            System.out.println("1.View Balance");
            System.out.println("2.Buy Stocks");
            System.out.println("3.Sell Stocks");
            System.out.println("4.View Portfolio");
            System.out.println("5.Exit");
            System.out.println("Enter choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current Balance:Rs." + balance);
                    break;
                case 2:
                    buyStock(sc);
                    break;
                case 3:
                    sellStock(sc);
                    break;
                case 4:
                    viewPortfolio();
                    break;
                case 5:
                    System.out.println("Thank you for using this platform!");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 5);
    }

    static void buyStock(Scanner sc) {
        System.out.println("Enter number of stocks to buy:");
        int qty = sc.nextInt();
        double cost = qty * stockPrice;
        if (cost <= balance) {
            shares += qty;
            balance -= cost;
            System.out.println("Stocks purchased successfully!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    static void sellStock(Scanner sc) {
        System.out.println("Enter number of stocks to sell:");
        int qty = sc.nextInt();
        if (qty <= shares) {
            shares -= qty;
            balance += qty * stockPrice;
            System.out.println("Stocks sold successfully!");
        } else {
            System.out.println("Not enough stocks to sell!");
        }
    }

    static void viewPortfolio() {
        System.out.println("Total shares:" + shares);
        System.out.println("Available Balance:Rs." + balance);
    }

}
