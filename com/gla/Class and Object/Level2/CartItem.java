// CartItem class
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Method to add item to cart
    void addItem(String name, double itemPrice, int qty) {
        itemName = name;
        price = itemPrice;
        quantity += qty;   // Increase quantity
        System.out.println(qty + " item(s) added to cart.");
    }

    // Method to remove item from cart
    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " item(s) removed from cart.");
        } else {
            System.out.println("Cannot remove more than available quantity!");
        }
    }

    // Method to display total cost
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Cost: " + total);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating object of CartItem class
        CartItem item1 = new CartItem();

        // Adding items
        item1.addItem("Headphones", 1500.0, 3);

        // Removing items
        item1.removeItem(1);

        // Display total cost
        item1.displayTotalCost();
    }
}
