import java.util.*;

public class EmailNotifications {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "user1@example.com",
                "user2@example.com",
                "user3@example.com"
        );

        emails.forEach(email ->
                System.out.println("Sending email to: " + email)
        );
    }
}
