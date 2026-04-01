public class ShoppingCartCalculation {

    public static void main(String[] args) {

        // Prices stored as Strings
        String[] prices = {"250", "499", "99", "abc", "150"};

        int total = 0;

        for (String price : prices) {
            try {
                // Convert String to int
                int value = Integer.parseInt(price);
                total += value;
            } catch (NumberFormatException e) {
                // Handle invalid input
                System.out.println("Invalid price skipped: " + price);
            }
        }

        // Display total price
        System.out.println("Total Price: " + total);
    }
}
