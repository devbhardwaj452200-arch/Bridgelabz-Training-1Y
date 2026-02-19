// Abstract Vehicle class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Encapsulation: getters and setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);
}

// Interface for insurable vehicles
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Car class
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber; // encapsulated

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // fixed insurance cost for demo
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}

// Bike class
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber; // encapsulated

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8; // bikes have 20% discount
    }

    @Override
    public double calculateInsurance() {
        return 200; // fixed insurance cost for demo
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}

// Truck class
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber; // encapsulated

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5; // trucks cost more
    }

    @Override
    public double calculateInsurance() {
        return 1000; // fixed insurance cost for demo
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}

// Main class to demonstrate polymorphism
import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C123", 1000, "CAR-INS-001"));
        vehicles.add(new Bike("B456", 300, "BIKE-INS-002"));
        vehicles.add(new Truck("T789", 2000, "TRUCK-INS-003"));

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Rental Cost for " + rentalDays + " days: " + v.calculateRentalCost(rentalDays));

            if (v instanceof Insurable insurableVehicle) {
                System.out.println("Insurance Cost: " + insurableVehicle.calculateInsurance());
                System.out.println(insurableVehicle.getInsuranceDetails());
            }
            System.out.println("-------------------------------");
        }
    }
}
