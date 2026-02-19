public class VehicleRentalSystem {

    interface Rentable {
        void rent();
        void returnVehicle();
    }

    static class Car implements Rentable {
        public void rent() {
            System.out.println("Car rented");
        }

        public void returnVehicle() {
            System.out.println("Car returned");
        }
    }

    static class Bike implements Rentable {
        public void rent() {
            System.out.println("Bike rented");
        }

        public void returnVehicle() {
            System.out.println("Bike returned");
        }
    }

    static class Bus implements Rentable {
        public void rent() {
            System.out.println("Bus rented");
        }

        public void returnVehicle() {
            System.out.println("Bus returned");
        }
    }

    public static void main(String[] args) {
        Rentable v1 = new Car();
        Rentable v2 = new Bike();
        Rentable v3 = new Bus();

        v1.rent();
        v2.rent();
        v3.rent();

        v1.returnVehicle();
        v2.returnVehicle();
        v3.returnVehicle();
    }
}
