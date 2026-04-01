public class LoginValidation {

    // Method to validate age
    public static boolean isValidAge(String ageStr) {
        try {
            // Convert String to int using wrapper class
            int age = Integer.parseInt(ageStr);

            // Check if age is 18 or older
            if (age >= 18) {
                return true;
            } else {
                return false;
            }

        } catch (NumberFormatException e) {
            // Invalid integer input
            return false;
        }
    }

    public static void main(String[] args) {

        // Test cases
        System.out.println(isValidAge("20"));   // true
        System.out.println(isValidAge("17"));   // false
        System.out.println(isValidAge("abc"));  // false
        System.out.println(isValidAge("18"));   // true
    }
}
