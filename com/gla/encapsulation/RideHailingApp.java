// Abstract Vehicle class
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation: getters and setters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        if (ratePerKm >= 0)
            this.ratePerKm = ratePerKm;
    }

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    // Abstract method
    public abstract double calculateFare(double distance);
}

// GPS interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Car class
class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        // Cars may have a base fare + distance * rate
        double baseFare = 50;
        return baseFare + distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Bike class
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        // Bikes are cheaper: only distance * rate
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Auto class
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        // Autos may have a minimal fare + distance * rate
        double baseFare = 30;
        return baseFare + distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Main class demonstrating polymorphism
import java.util.ArrayList;
import java.util.List;

public class RideHailingApp {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C001", "Alice", 15, "Downtown"));
        vehicles.add(new Bike("B101", "Bob", 8, "Uptown"));
        vehicles.add(new Auto("A501", "Charlie", 10, "City Center"));

        double distance = 12; // ride distance in km

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            ((GPS) v).updateLocation("New Location"); // updating location
            System.out.println("Updated Location: " + ((GPS) v).getCurrentLocation());
            System.out.println("--------------------------");
        }
    }
}
