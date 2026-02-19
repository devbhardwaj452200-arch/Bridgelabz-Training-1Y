import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {

        // Functional Interface using Lambda
        Predicate<Double> isHighTemperature = temp -> temp > 40.0;

        double currentTemp = 45.5;

        if (isHighTemperature.test(currentTemp)) {
            System.out.println("⚠ ALERT! High Temperature: " + currentTemp);
        } else {
            System.out.println("Temperature is normal: " + currentTemp);
        }
    }
}
