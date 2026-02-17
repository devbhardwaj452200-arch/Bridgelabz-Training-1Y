// CarRental class
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    // Default constructor
    CarRental() {
        this("Unknown Customer", "Standard Car", 1); // Default values
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }

    // Method to calculate total cost based on car model and rental days
    void calculateTotalCost() {
        double dailyRate;
        switch (carModel.toLowerCase()) {
            case "sedan":
                dailyRate = 1000.0;
                break;
            case "suv":
                dailyRate = 1500.0;
                break;
            case "luxury":
                dailyRate = 3000.0;
                break;
            default:
                dailyRate = 800.0; // Standard car
        }
        totalCost = dailyRate * rentalDays;
    }

    // Method to display rental details
    void displayRental() {
        System.out.println("Car Rental Details:");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : " + totalCost);
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Using default constructor
        CarRental rental1 = new CarRental();
        rental1.displayRental();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Alice", "SUV", 5);
        rental2.displayRental();

        // Another rental
        CarRental rental3 = new CarRental("Bob", "Luxury", 2);
        rental3.displayRental();
    }
}
