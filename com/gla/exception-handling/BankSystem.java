import java.util.Scanner;

// Custom Checked Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw Method
    public void withdraw(double amount) throws InsufficientBalanceException {

        // Check for negative amount (Unchecked Exception)
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        // Check for insufficient balance (Checked Exception)
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        // Perform withdrawal
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

// Main Class
public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial balance
        BankAccount account = new BankAccount(1000);

        try {
            // User input
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            // Attempt withdrawal
            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            // Handle custom checked exception
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            // Handle invalid input
            System.out.println(e.getMessage());

        } finally {
            sc.close();
        }
    }
}
