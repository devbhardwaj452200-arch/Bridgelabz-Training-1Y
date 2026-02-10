package Extras1;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = getInput();
        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
    }

    // Function to take input from user
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Function to check if the string is a palindrome
    public static boolean checkPalindrome(String str) {

        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Function to display the result
    public static void displayResult(String input, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a PALINDROME.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }
}
