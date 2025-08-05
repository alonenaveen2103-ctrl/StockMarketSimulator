// 📂 File: User.java
// This is the base class for user accounts
// Contains common logic and is extended by PremiumUser

class User {
    private String name;       // Only accessible through getName()
    protected double balance;  // Accessible from child class (PremiumUser)

    // Constructor: sets user name and balance
    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Getter for name - called from Main.java
    public String getName() {
        return name;
    }

    // Getter for balance - called from Main.java
    public double getBalance() {
        return balance;
    }

    // Method to buy stocks - called from Main.java using PremiumUser object
    public void buyStock(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Bought stocks for ₹" + amount);
        } else {
            System.out.println("Insufficient balance to buy stocks.");
        }
    }

    // Method to buy bonds - called from Main.java using PremiumUser object
    public void buyBond(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Bought bonds for ₹" + amount);
        } else {
            System.out.println("Insufficient balance to buy bonds.");
        }
    }

    // Base interest calculation - overridden in PremiumUser
    public double calculateInterest() {
        return balance * 0.075; // 7.5% interest
    }
}

