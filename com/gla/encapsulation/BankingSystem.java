// Abstract BankAccount class
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation: getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) { // protected to allow controlled modification in subclasses
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Abstract method for interest calculation
    public abstract double calculateInterest();
}

// Interface for loanable accounts
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // in percentage

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of " + amount + " approved for Savings Account " + getAccountNumber());
        } else {
            System.out.println("Loan denied for Savings Account " + getAccountNumber());
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        // Example: eligible if balance > 5000
        return getBalance() > 5000;
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        // Current accounts may have minimal or zero interest
        return getBalance() * 0.5 / 100; // 0.5% interest
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of " + amount + " approved for Current Account " + getAccountNumber());
        } else {
            System.out.println("Loan denied for Current Account " + getAccountNumber());
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        // Example: eligible if balance + overdraftLimit > 10000
        return (getBalance() + overdraftLimit) > 10000;
    }
}

// Main class to demonstrate polymorphism
import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SA001", "Alice", 8000, 4));
        accounts.add(new CurrentAccount("CA101", "Bob", 5000, 7000));

        // Process accounts polymorphically
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            // Deposit and withdraw demo
            account.deposit(1000);
            account.withdraw(500);

            // Loan operations
            if (account instanceof Loanable loanableAccount) {
                loanableAccount.applyForLoan(10000);
                System.out.println("Loan Eligibility: " + loanableAccount.calculateLoanEligibility());
            }

            System.out.println("----------------------------");
        }
    }
}
