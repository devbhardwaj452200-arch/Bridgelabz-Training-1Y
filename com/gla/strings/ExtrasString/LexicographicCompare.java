package ExtrasString;
import java.util.Scanner;

public class LexicographicCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        int result = compareStrings(str1, str2);

        if (result == 0) {
            System.out.println("Both strings are equal.");
        } else if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" lexicographically.");
        } else {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" lexicographically.");
        }

        sc.close();
    }

    // Function to compare two strings lexicographically
    public static int compareStrings(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int n = Math.min(n1, n2);

        for (int i = 0; i < n; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                return c1 - c2; // return difference of ASCII values
            }
        }

        // If all characters are equal in the common length, the shorter string is "smaller"
        return n1 - n2;
    }
}
