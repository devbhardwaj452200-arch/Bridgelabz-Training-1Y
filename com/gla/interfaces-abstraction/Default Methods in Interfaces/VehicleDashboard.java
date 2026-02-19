public class VehicleDashboard {

    interface Vehicle {

        void displaySpeed();

        // New feature added
        default void displayBattery() {
            System.out.println("Battery info not available.");
        }
    }

    static class Car implements Vehicle {
        public void displaySpeed() {
            System.out.println("Car Speed: 80 km/h");
        }
    }

    static class ElectricCar implements Vehicle {
        public void displaySpeed() {
            System.out.println("Electric Car Speed: 60 km/h");
        }

        // Overriding default method
        public void displayBattery() {
            System.out.println("Battery Level: 75%");
        }
    }

    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new ElectricCar();

        v1.displaySpeed();
        v1.displayBattery();   // Default

        v2.displaySpeed();
        v2.displayBattery();   // Overridden
    }
}
