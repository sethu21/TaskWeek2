package Task20;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class  Palindrome {
    public static boolean isPalindrome(String string) {
        int length = string.length();
        for (int i = 0; i < length / 2; i++) {
            if (string.charAt(i) != string.charAt(length - i - 1)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("please enter a string to check palindrome:  ");
        String user = userInput.next();
        System.out.println(isPalindrome(user));
    }

}
