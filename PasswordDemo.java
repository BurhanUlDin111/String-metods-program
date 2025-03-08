import java.util.Scanner;

class PasswordVerifier {
    public static boolean verifyPassword(String password) {
        if (password.length() < 6) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            if (hasUppercase && hasLowercase && hasDigit) {
                break;
            }
        }

        return hasUppercase && hasLowercase && hasDigit;
    }
}

public class PasswordDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            if (PasswordVerifier.verifyPassword(password)) {
                System.out.println("Password is valid!");
                break;
            } else {
                System.out.println("Password is invalid. Please try again.");
                System.out.println("Password must meet the following criteria:");
                System.out.println("1. At least 6 characters long.");
                System.out.println("2. At least one uppercase letter.");
                System.out.println("3. At least one lowercase letter.");
                System.out.println("4. At least one digit.");
            }
        }

        scanner.close();
    }
}
