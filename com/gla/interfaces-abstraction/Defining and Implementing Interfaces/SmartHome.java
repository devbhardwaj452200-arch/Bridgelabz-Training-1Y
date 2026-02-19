public class SmartHome {

    // Interface
    interface SmartDevice {
        void turnOn();
        void turnOff();
    }

    // Implementation Classes
    static class Light implements SmartDevice {
        public void turnOn() {
            System.out.println("Light is ON");
        }

        public void turnOff() {
            System.out.println("Light is OFF");
        }
    }

    static class AC implements SmartDevice {
        public void turnOn() {
            System.out.println("AC is ON");
        }

        public void turnOff() {
            System.out.println("AC is OFF");
        }
    }

    static class TV implements SmartDevice {
        public void turnOn() {
            System.out.println("TV is ON");
        }

        public void turnOff() {
            System.out.println("TV is OFF");
        }
    }

    // Main Method
    public static void main(String[] args) {
        SmartDevice d1 = new Light();
        SmartDevice d2 = new AC();
        SmartDevice d3 = new TV();

        d1.turnOn();
        d2.turnOn();
        d3.turnOn();

        d1.turnOff();
        d2.turnOff();
        d3.turnOff();
    }
}
