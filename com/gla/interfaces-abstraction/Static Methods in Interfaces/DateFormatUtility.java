import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatUtility {

    interface DateUtils {

        static String formatDate(LocalDate date, String pattern) {
            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern(pattern);
            return date.format(formatter);
        }
    }

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("Default Format: " +
                DateUtils.formatDate(today, "dd-MM-yyyy"));

        System.out.println("US Format: " +
                DateUtils.formatDate(today, "MM/dd/yyyy"));

        System.out.println("Long Format: " +
                DateUtils.formatDate(today, "dd MMMM yyyy"));
    }
}
