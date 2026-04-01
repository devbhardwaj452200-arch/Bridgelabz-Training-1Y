public class BankTransaction {

    // Method to calculate remaining limit
    public static double getRemainingLimit(Double limit, double withdrawnAmount) {

        // Handle null case
        if (limit == null) {
            return 0.0;
        }

        // Calculate remaining limit
        double remaining = limit - withdrawnAmount;

        // Ensure it doesn't go negative (optional safety)
        if (remaining < 0) {
            return 0.0;
        }

        return remaining;
    }

    public static void main(String[] args) {

        // Test cases
        System.out.println(getRemainingLimit(1000.0, 300.0)); // 700.0
        System.out.println(getRemainingLimit(null, 200.0));   // 0.0
        System.out.println(getRemainingLimit(500.0, 600.0));  // 0.0
    }
}
