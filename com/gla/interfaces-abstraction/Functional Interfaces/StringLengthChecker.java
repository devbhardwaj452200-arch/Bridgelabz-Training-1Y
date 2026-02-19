import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        // Functional Interface using Lambda
        Function<String, Integer> getLength = str -> str.length();

        String message = "Welcome to Java Programming";

        int length = getLength.apply(message);

        System.out.println("Message: " + message);
        System.out.println("Length: " + length);

        if (length > 20) {
            System.out.println("⚠ Message exceeds character limit!");
        } else {
            System.out.println("Message within limit.");
        }
    }
}
