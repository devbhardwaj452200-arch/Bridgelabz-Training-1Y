package ExtrasString;
import java.util.Scanner;

public class SubstringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();

        System.out.print("Enter the substring to search: ");
        String subString = sc.nextLine();

        int count = 0;
        int index = 0;

        // Loop to find all occurrences of the substring
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length(); // move past the last found substring
        }

        System.out.println("The substring '" + subString + "' occurs " + count + " times.");

        sc.close();
    }
}
