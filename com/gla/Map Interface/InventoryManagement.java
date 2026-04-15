import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {

    public static void main(String[] args) {

        // Create Map: product name -> quantity
        Map<String, Integer> inventory = new HashMap<>();

        // 1. Add new products
        inventory.put("Apple", 50);
        inventory.put("Banana", 30);
        inventory.put("Milk", 10);
        inventory.put("Bread", 5);

        // 2. Customer buys products
        buyProduct(inventory, "Apple", 20);
        buyProduct(inventory, "Milk", 10);
        buyProduct(inventory, "Bread", 6); // exceeds stock

        // 3. New shipment arrives
        restockProduct(inventory, "Milk", 25);
        restockProduct(inventory, "Eggs", 40); // new product

        // 4. Query products
        queryProduct(inventory, "Apple");
        queryProduct(inventory, "Bread");
        queryProduct(inventory, "Eggs");
        queryProduct(inventory, "Cheese"); // not stocked

        // Print out-of-stock products
        printOutOfStock(inventory);
    }

    // Method to handle buying
    public static void buyProduct(Map<String, Integer> inventory, String product, int quantity) {
        if (inventory.containsKey(product)) {
            int currentStock = inventory.get(product);
            int newStock = currentStock - quantity;

            if (newStock <= 0) {
                inventory.put(product, 0);
                System.out.println(product + " is now OUT OF STOCK.");
            } else {
                inventory.put(product, newStock);
                System.out.println("Purchased " + quantity + " " + product + "(s). Remaining: " + newStock);
            }
        } else {
            System.out.println(product + " is not available in store.");
        }
    }

    // Method to restock
    public static void restockProduct(Map<String, Integer> inventory, String product, int quantity) {
        int currentStock = inventory.getOrDefault(product, 0);
        inventory.put(product, currentStock + quantity);
        System.out.println(product + " restocked. New quantity: " + inventory.get(product));
    }

    // Method to query product
    public static void queryProduct(Map<String, Integer> inventory, String product) {
        if (inventory.containsKey(product)) {
            System.out.println(product + " available: " + inventory.get(product));
        } else {
            System.out.println(product + " is NOT STOCKED.");
        }
    }

    // Method to print out-of-stock items
    public static void printOutOfStock(Map<String, Integer> inventory) {
        System.out.println("\nOut of Stock Products:");
        boolean found = false;

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.println(entry.getKey());
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }
    }
}
