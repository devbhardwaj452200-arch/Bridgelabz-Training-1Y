package Extras1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Date format
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Input first date
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine(), formatter);

        // Input second date
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine(), formatter);

        // Compare dates
        if (date1.isBefore(date2)) {
            System.out.println("The first date is BEFORE the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is AFTER the second date.");
        } else {
            System.out.println("Both dates are the SAME.");
        }

        sc.close();
    }
}
