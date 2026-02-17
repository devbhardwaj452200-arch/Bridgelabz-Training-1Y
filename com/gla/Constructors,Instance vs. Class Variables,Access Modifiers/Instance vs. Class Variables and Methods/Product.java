// Product class
class Product {
    // Instance variables (unique to each object)
    String productName;
    double price;

    // Class variable (shared among all objects)
    static int totalProducts = 0;

    // Constructor
    Product(String name, double price) {
        this.productName = name;
        this.price = price;
        totalProducts++; // Increment total products whenever a new product is created
    }

    // Instance method to display product details
    void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println();
    }

    // Class method to display total products
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating product objects
        Product p1 = new Product("Laptop", 50000.0);
        Product p2 = new Product("Smartphone", 20000.0);
        Product p3 = new Product("Headphones", 1500.0);

        // Displaying details of each product using instance method
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Displaying total number of products using class method
        Product.displayTotalProducts();
    }
}
