import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input month, day, and year
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();

        System.out.print("Enter year: ");
        int y = sc.nextInt();

        // Adjust month and year for Zeller's formula
        if (m == 1 || m == 2) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;     // Year of the century
        int j = y / 100;     // Zero-based century

        // Zeller's Congruence formula for Gregorian calendar
        int f = d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j);
        int dayOfWeek = f % 7; // 0 = Saturday, 1 = Sunday, ..., 6 = Friday

        // Adjust output to make 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        dayOfWeek = (dayOfWeek + 6) % 7;

        System.out.println("Day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday): " + dayOfWeek);

        sc.close();
    }
}
