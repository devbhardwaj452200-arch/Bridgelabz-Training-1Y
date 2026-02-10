package ExtrasString;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = ""; // to store the reversed string

        // Loop from the end of the string to the beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // add each character to the reversed string
        }

        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
