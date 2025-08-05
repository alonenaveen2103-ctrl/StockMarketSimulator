// 📂 File: PremiumUser.java
// Inherits from User class and overrides calculateInterest()
// Used to demonstrate inheritance and polymorphism

class PremiumUser extends User {
    // Constructor - calls parent constructor using super()
    public PremiumUser(String name, double balance) {
        super(name, balance); // Pass values to User class constructor
    }

    // Overridden method - provides higher interest rate than base class
    // Called from Main.java using user.calculateInterest()
    @Override
    public double calculateInterest() {
        return balance * 0.085; // 8.5% interest for premium users
    }
}