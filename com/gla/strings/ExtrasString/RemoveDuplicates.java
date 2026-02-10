package ExtrasString;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = ""; // to store the modified string

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Add the character only if it is not already in result
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}
