// Superclass
class Vehicle {
    int maxSpeed;
    String fuelType;

    // Constructor
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display info
    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("\nCar Details:");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass Truck
class Truck extends Vehicle {
    double loadCapacity;

    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("\nTruck Details:");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    boolean hasHelmet;

    Motorcycle(int maxSpeed, String fuelType, boolean hasHelmet) {
        super(maxSpeed, fuelType);
        this.hasHelmet = hasHelmet;
    }

    @Override
    void displayInfo() {
        System.out.println("\nMotorcycle Details:");
        super.displayInfo();
        System.out.println("Helmet Available: " + (hasHelmet ? "Yes" : "No"));
    }
}

// Main class
public class VehicleTest {
    public static void main(String[] args) {

        // Polymorphism using array
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10.5);
        vehicles[2] = new Motorcycle(150, "Petrol", true);

        // Loop through and call displayInfo()
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
