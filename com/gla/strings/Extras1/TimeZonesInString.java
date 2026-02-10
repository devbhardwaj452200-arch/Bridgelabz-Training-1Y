package Extras1;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZonesInString {

    public static void main(String[] args) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        // Convert times directly into String
        String gmtTime = ZonedDateTime
                .now(ZoneId.of("GMT"))
                .format(formatter);

        String istTime = ZonedDateTime
                .now(ZoneId.of("Asia/Kolkata"))
                .format(formatter);

        String pstTime = ZonedDateTime
                .now(ZoneId.of("America/Los_Angeles"))
                .format(formatter);

        // Display String values
        System.out.println("GMT Time: " + gmtTime);
        System.out.println("IST Time: " + istTime);
        System.out.println("PST Time: " + pstTime);
    }
}
