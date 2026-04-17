import java.util.*;

public class SensorReadings {
    public static void main(String[] args) {
        List<Double> readings = Arrays.asList(25.5, 30.2, 18.9, 40.1);

        double threshold = 25.0;

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r ->
                        System.out.println("High Reading: " + r)
                );
    }
}
