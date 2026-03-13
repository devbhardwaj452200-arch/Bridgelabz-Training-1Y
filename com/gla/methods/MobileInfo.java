public class MobileInfo {

    String brand;
    String model;
    int price;
    int storage;

    // Constructor
    MobileInfo(String brand, String model, int price, int storage) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storage = storage;
    }

    // Method to display mobile information
    void displayInfo() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("Storage: " + storage + " GB");
    }

    // Main method
    public static void main(String[] args) {
        MobileInfo mobile1 = new MobileInfo("Samsung", "Galaxy S23", 75000, 256);

        mobile1.displayInfo();
    }
}
