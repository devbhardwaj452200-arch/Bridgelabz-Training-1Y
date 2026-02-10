package ExtrasString;
import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char removeChar = sc.next().charAt(0);

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != removeChar) { // add only if it is not the character to remove
                result += ch;
            }
        }

        System.out.println("String after removing '" + removeChar + "': " + result);

        sc.close();
    }
}
