// Item class
class Item {
    int itemCode;
    String itemName;
    double price;

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Method to display item details
    void displayItem(int quantity) {
        System.out.println("Item Details:");
        System.out.println("Item Code   : " + itemCode);
        System.out.println("Item Name   : " + itemName);
        System.out.println("Price       : " + price);
        System.out.println("Quantity    : " + quantity);
        System.out.println("Total Cost  : " + calculateTotalCost(quantity));
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating object of Item class
        Item item1 = new Item();

        // Assigning values
        item1.itemCode = 101;
        item1.itemName = "Laptop";
        item1.price = 55000.0;

        // Given quantity
        int quantity = 2;

        // Display item details and total cost
        item1.displayItem(quantity);
    }
}
