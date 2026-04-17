import java.time.*;
import java.util.*;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() { return expiryDate; }

    @Override
    public String toString() {
        return name + " expires on " + expiryDate;
    }
}

public class ExpiringMemberships {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
                new Member("John", LocalDate.now().plusDays(10)),
                new Member("Alice", LocalDate.now().plusDays(40)),
                new Member("Bob", LocalDate.now().plusDays(25))
        );

        LocalDate today = LocalDate.now();

        members.stream()
                .filter(m -> m.getExpiryDate().isBefore(today.plusDays(30)))
                .forEach(System.out::println);
    }
}
