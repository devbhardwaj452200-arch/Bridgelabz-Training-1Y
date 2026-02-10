package ExtrasString;
import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String toggled = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                toggled += Character.toLowerCase(ch); // Convert uppercase to lowercase
            } else if (Character.isLowerCase(ch)) {
                toggled += Character.toUpperCase(ch); // Convert lowercase to uppercase
            } else {
                toggled += ch; // Keep non-alphabetic characters as they are
            }
        }

        System.out.println("Toggled case string: " + toggled);

        sc.close();
    }
}
