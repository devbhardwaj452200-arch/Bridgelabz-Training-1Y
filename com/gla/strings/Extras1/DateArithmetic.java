package Extras1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input format: yyyy-MM-dd
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();

        // Convert String to LocalDate
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);

        // Output
        System.out.println("Original Date: " + date);
        System.out.println("After adding 7 days, 1 month, 2 years: " + updatedDate);
        System.out.println("After subtracting 3 weeks: " + finalDate);

        sc.close();
    }
}
