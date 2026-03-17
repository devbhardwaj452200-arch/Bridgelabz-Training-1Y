// Superclass
class Vehicle {
    int maxSpeed;
    String model;

    // Constructor
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface (for multiple inheritance behavior)
interface Refuelable {
    void refuel();
}

// Subclass 1: ElectricVehicle
class ElectricVehicle extends Vehicle {

    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Charging the electric vehicle...");
    }

    void displayDetails() {
        System.out.println("\nElectric Vehicle Details:");
        displayInfo();
    }
}

// Subclass 2: PetrolVehicle (Hybrid: extends + implements)
class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }

    void displayDetails() {
        System.out.println("\nPetrol Vehicle Details:");
        displayInfo();
    }
}

// Main class
public class VehicleHybridTest {
    public static void main(String[] args) {

        // Electric Vehicle object
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        ev.displayDetails();
        ev.charge();

        // Petrol Vehicle object
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");
        pv.displayDetails();
        pv.refuel();
    }
}
