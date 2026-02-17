// PalindromeChecker class
class PalindromeChecker {
    String text;

    // Method to check palindrome
    boolean isPalindrome() {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return text.equalsIgnoreCase(reversed);
    }

    // Method to display result
    void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome.");
        else
            System.out.println(text + " is NOT a Palindrome.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        PalindromeChecker p1 = new PalindromeChecker();
        p1.text = "Madam";

        p1.displayResult();
    }
}
