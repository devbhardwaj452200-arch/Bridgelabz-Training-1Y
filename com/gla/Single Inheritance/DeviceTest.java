// Superclass
class Device {
    String deviceId;
    String status;

    // Constructor
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass (Single Inheritance)
class Thermostat extends Device {
    double temperatureSetting;

    // Constructor
    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding method
    @Override
    void displayStatus() {
        System.out.println("\nThermostat Details:");
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class
public class DeviceTest {
    public static void main(String[] args) {

        // Create object of subclass
        Thermostat t1 = new Thermostat("T101", "ON", 24.5);

        // Call method
        t1.displayStatus();
    }
}
