import java.util.Scanner;

public class ValidPasswordChecker {
    public static boolean isValidPassword(String password) {
        int count = 0;
        if (password.length() < 8) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if (Character.isDigit(c)) {
                count++;
            }
        }
        if (count < 2) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Password rules:");
        System.out.println("A password must have at least ten characters.");
        System.out.println("A password consists of only letters and digits.");
        System.out.println("A password must contain at least two digits.");
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions): ");
        String password = sc.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is invalid.");
        }
    }
}
