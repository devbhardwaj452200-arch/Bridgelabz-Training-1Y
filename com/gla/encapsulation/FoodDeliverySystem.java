// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation: getters and setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0)
            this.quantity = quantity;
    }

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }

    // Abstract method
    public abstract double calculateTotalPrice();
}

// Interface for discountable items
interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
    private double discount; // in percentage

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        // Apply discount if any
        total -= total * (discount / 100);
        return total;
    }

    @Override
    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            discount = percent;
        }
    }

    @Override
    public String getDiscountDetails() {
        return "Discount on " + getItemName() + ": " + discount + "%";
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private double extraChargePerItem; // e.g., extra charge for non-veg

    public NonVegItem(String itemName, double price, int quantity, double extraChargePerItem) {
        super(itemName, price, quantity);
        this.discount = 0;
        this.extraChargePerItem = extraChargePerItem;
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + extraChargePerItem) * getQuantity();
        total -= total * (discount / 100);
        return total;
    }

    @Override
    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            discount = percent;
        }
    }

    @Override
    public String getDiscountDetails() {
        return "Discount on " + getItemName() + ": " + discount + "%";
    }
}

// Main class to demonstrate polymorphism
import java.util.ArrayList;
import java.util.List;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        VegItem veg1 = new VegItem("Paneer Butter Masala", 200, 2);
        NonVegItem nonVeg1 = new NonVegItem("Chicken Biryani", 300, 1, 50);

        // Apply discounts
        veg1.applyDiscount(10); // 10% discount
        nonVeg1.applyDiscount(5); // 5% discount

        order.add(veg1);
        order.add(nonVeg1);

        // Process order polymorphically
        double grandTotal = 0;
        for (FoodItem item : order) {
            item.getItemDetails();
            if (item instanceof Discountable discountableItem) {
                System.out.println(discountableItem.getDiscountDetails());
            }
            System.out.println("Total Price: " + item.calculateTotalPrice());
            grandTotal += item.calculateTotalPrice();
            System.out.println("---------------------");
        }

        System.out.println("Grand Total for Order: " + grandTotal);
    }
}
