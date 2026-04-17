import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Alert {
    String type;     // e.g., CRITICAL, GENERAL, REMINDER
    String message;

    public Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return type + " → " + message;
    }
}

public class HospitalNotificationSystem {

    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("CRITICAL", "Heart rate abnormal"),
                new Alert("GENERAL", "Daily checkup reminder"),
                new Alert("REMINDER", "Take medication"),
                new Alert("CRITICAL", "Oxygen level low")
        );

        // User preference (can be dynamic)
        Set<String> allowedTypes = new HashSet<>(Arrays.asList("CRITICAL", "REMINDER"));

        // Predicate using lambda
        Predicate<Alert> filterByPreference = alert ->
                allowedTypes.contains(alert.type);

        // Apply filtering using Stream API
        List<Alert> filteredAlerts = alerts.stream()
                .filter(filterByPreference)
                .collect(Collectors.toList());

        // Display result
        filteredAlerts.forEach(System.out::println);
    }
}
