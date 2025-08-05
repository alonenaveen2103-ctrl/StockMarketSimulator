// 📂 File: Main.java
// Main class - entry point of the program
// Handles user interaction and calls methods from PremiumUser (which inherits from User)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a PremiumUser object
        // PremiumUser inherits from User class and overrides calculateInterest()
        PremiumUser user = new PremiumUser("Naveen", 10000);

        // Initial greeting message
        System.out.println("Welcome, " + user.getName() + "!\nYour Starting Balance: ₹" + user.getBalance());

        // Menu loop - keeps showing options until user exits
        while (true) {
            System.out.println("\n--- Investment Menu ---");
            System.out.println("1. Buy Stocks");
            System.out.println("2. Buy Bonds");
            System.out.println("3. Check Balance");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            // Switch-case to handle different menu options
            switch (choice) {
                case 1:
                    // Buy stocks using method from User class (inherited by PremiumUser)
                    System.out.print("Enter amount to buy stocks: ");
                    double stockAmt = sc.nextDouble();
                    user.buyStock(stockAmt);
                    break;
                case 2:
                    // Buy bonds using method from User class
                    System.out.print("Enter amount to buy bonds: ");
                    double bondAmt = sc.nextDouble();
                    user.buyBond(bondAmt);
                    break;
                case 3:
                    // Get balance from User class
                    System.out.println("Current Balance: ₹" + user.getBalance());
                    break;
                case 4:
                    // Calculate interest using overridden method in PremiumUser
                    System.out.println("Interest Earned: ₹" + user.calculateInterest());
                    break;
                case 5:
                    // Exit program
                    System.out.println("Thank you for investing!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
