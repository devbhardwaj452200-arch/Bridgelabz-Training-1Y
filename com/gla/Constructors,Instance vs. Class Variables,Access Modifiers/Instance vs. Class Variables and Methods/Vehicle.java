// Vehicle class
class Vehicle {
    // Instance variables (unique to each vehicle)
    String ownerName;
    String vehicleType;

    // Class variable (shared among all vehicles)
    static double registrationFee = 500.0; // Default registration fee

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : " + registrationFee);
        System.out.println();
    }

    // Class method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating vehicle objects
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorcycle");

        // Display initial vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee using class method
        Vehicle.updateRegistrationFee(750.0);

        // Display vehicle details after fee update
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
