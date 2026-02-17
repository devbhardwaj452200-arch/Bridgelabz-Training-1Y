// BankAccount class
class BankAccount {
    public int accountNumber;      // Public: accessible anywhere
    protected String accountHolder; // Protected: accessible in subclass and package
    private double balance;         // Private: accessible only within this class

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
        System.out.println();
    }
}

// Subclass demonstrating access to public and protected members
class SavingsAccount extends BankAccount {
    double interestRate;

    // Constructor
    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Display savings account details
    public void displaySavingsDetails() {
        // Accessing protected member 'accountHolder' and public 'accountNumber'
        System.out.println("Savings Account Details:");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + getBalance()); // private via public method
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating a regular BankAccount object
        BankAccount ba1 = new BankAccount(101, "Alice", 10000.0);
        ba1.displayAccountDetails();

        // Deposit and withdraw using public methods
        ba1.deposit(2000);
        ba1.withdraw(1500);
        System.out.println("Updated Balance: " + ba1.getBalance());
        System.out.println();

        // Creating a SavingsAccount object
        SavingsAccount sa1 = new SavingsAccount(201, "Bob", 50000.0, 5.0);
        sa1.displaySavingsDetails();
    }
}
