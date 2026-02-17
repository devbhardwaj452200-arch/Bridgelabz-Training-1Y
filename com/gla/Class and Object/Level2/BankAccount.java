// BankAccount class
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Method to display current balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating object of BankAccount class
        BankAccount acc1 = new BankAccount();

        // Assigning values
        acc1.accountHolder = "Amit";
        acc1.accountNumber = 12345;
        acc1.balance = 10000.0;

        // Simulating ATM operations
        acc1.displayBalance();
        acc1.deposit(5000);
        acc1.withdraw(3000);
        acc1.withdraw(15000);   // Attempt to withdraw more than balance
        acc1.displayBalance();
    }
}
