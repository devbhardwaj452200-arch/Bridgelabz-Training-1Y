import static java.lang.Math.*;

public class StaticImportDemo {

    public static void main(String[] args) {

        double number = 25;

        System.out.println("Square Root: " + sqrt(number));
        System.out.println("Power (5^3): " + pow(5, 3));
        System.out.println("Maximum (10, 20): " + max(10, 20));
        System.out.println("Minimum (10, 20): " + min(10, 20));
        System.out.println("Absolute value (-15): " + abs(-15));
    }
}