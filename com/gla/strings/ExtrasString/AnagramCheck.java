package ExtrasString;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase(); // remove spaces & lowercase

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase(); // remove spaces & lowercase

        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

        sc.close();
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false; // different lengths cannot be anagrams
        }

        int[] freq = new int[256]; // ASCII character frequency array

        // Count characters in the first string
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
        }

        // Subtract character counts using the second string
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i)]--;
        }

        // If all counts are 0, strings are anagrams
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
