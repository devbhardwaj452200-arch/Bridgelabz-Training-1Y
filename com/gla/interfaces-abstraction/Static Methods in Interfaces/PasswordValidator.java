public class PasswordValidator {

    interface SecurityUtils {

        // Static method inside interface
        static boolean isStrongPassword(String password) {
            if (password.length() < 8) return false;

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;

            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) hasUpper = true;
                if (Character.isLowerCase(ch)) hasLower = true;
                if (Character.isDigit(ch)) hasDigit = true;
            }

            return hasUpper && hasLower && hasDigit;
        }
    }

    public static void main(String[] args) {

        String password = "Insure123";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password ✅");
        } else {
            System.out.println("Weak Password ❌");
        }
    }
}
