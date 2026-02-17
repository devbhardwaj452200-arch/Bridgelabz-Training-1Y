// MobilePhone class
class MobilePhone {
    String brand;
    String model;
    double price;

    // Method to display phone details
    void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand  : " + brand);
        System.out.println("Model  : " + model);
        System.out.println("Price  : " + price);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating object of MobilePhone class
        MobilePhone phone1 = new MobilePhone();

        // Assigning values
        phone1.brand = "Samsung";
        phone1.model = "Galaxy S23";
        phone1.price = 74999.0;

        // Displaying details
        phone1.displayDetails();
    }
}
