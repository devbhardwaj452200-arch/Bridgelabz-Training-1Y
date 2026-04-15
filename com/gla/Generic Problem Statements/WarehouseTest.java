import java.util.*;

// Abstract base class
abstract class WarehouseItem {
    String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public abstract void display();
}

// Electronics class
class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    public void display() {
        System.out.println("Electronics Item: " + name);
    }
}

// Groceries class
class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    public void display() {
        System.out.println("Grocery Item: " + name);
    }
}

// Furniture class
class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    public void display() {
        System.out.println("Furniture Item: " + name);
    }
}

// Generic Storage class
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    // Add item
    public void addItem(T item) {
        items.add(item);
    }

    // Get all items
    public List<T> getItems() {
        return items;
    }
}

// Utility class for wildcard method
class WarehouseDisplay {

    // Wildcard method
    public static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.display();
        }
    }
}

// Test class
public class WarehouseTest {
    public static void main(String[] args) {

        // Electronics storage
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        // Grocery storage
        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Milk"));

        // Furniture storage
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        // Display all items using wildcard method
        System.out.println("Electronics:");
        WarehouseDisplay.displayAll(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        WarehouseDisplay.displayAll(groceryStorage.getItems());

        System.out.println("\nFurniture:");
        WarehouseDisplay.displayAll(furnitureStorage.getItems());
    }
}
