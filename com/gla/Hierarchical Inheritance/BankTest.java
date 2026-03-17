// Superclass
class BankAccount {
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Subclass 1: SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("\nAccount Type: Savings Account");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass 2: CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("\nAccount Type: Checking Account");
        displayDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

// Subclass 3: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    int tenure; // in months

    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("\nAccount Type: Fixed Deposit Account");
        displayDetails();
        System.out.println("Tenure: " + tenure + " months");
    }
}

// Main class
public class BankTest {
    public static void main(String[] args) {

        // Creating objects
        SavingsAccount s = new SavingsAccount("SA101", 10000, 4.5);
        CheckingAccount c = new CheckingAccount("CA102", 15000, 5000);
        FixedDepositAccount f = new FixedDepositAccount("FD103", 50000, 12);

        // Display account info
        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}
