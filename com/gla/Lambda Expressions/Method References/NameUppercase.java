import java.util.*;

public class NameUppercase {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Amit", "Neha", "Ravi");

        names.stream()
                .map(String::toUpperCase)      // Method Reference
                .forEach(System.out::println); // Method Reference
    }
}
