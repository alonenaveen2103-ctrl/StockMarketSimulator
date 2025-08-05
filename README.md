# 💸 Stock Market Simulator (OOP Java Project)

A Java console application simulating basic stock and bond transactions using Object-Oriented Programming concepts.

## 📂 Project Structure

- `Main.java` – Entry point, handles user interaction
- `User.java` – Base class for user logic (buy stock, bond, balance)
- `PremiumUser.java` – Inherits from `User` and overrides interest logic

## 🧠 Java OOP Concepts Used

| Concept        | Where It’s Applied                   |
|----------------|--------------------------------------|
| Class & Object | All 3 files use classes and objects  |
| Inheritance    | `PremiumUser extends User`           |
| Polymorphism   | Overridden `calculateInterest()`     |
| Encapsulation  | `private name`, `protected balance`  |
| Abstraction    | `buyStock()`, `buyBond()` hide logic |

## 📌 Features
- Buy Stocks and Bonds
- Track Balance
- Calculate Interest
- Uses Premium interest logic via inheritance

---

✅ Built as part of Java full-course training  
🧠 Ideal for Java backend/fintech developer resume
