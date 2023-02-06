import java.util.Scanner;

public class ReplacePalindrome {
    public static boolean isPalindrome(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();

        String[] words = inputString.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                words[i] = "*".repeat(words[i].length());
            }
        }

        String outputString = String.join(" ", words);

        System.out.println("Output string: " + outputString);
    }
}
