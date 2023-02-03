package Task19;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class findMaxOccurrence{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = input.nextLine().toLowerCase();
            int[] count = new int[26];
            int max = 0;
            char result = ' ';
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    count[str.charAt(i) - 'a']++;
                    if (count[str.charAt(i) - 'a'] > max) {
                        max = count[str.charAt(i) - 'a'];
                        result = str.charAt(i);
                    }
                }
            }
            System.out.println("Number of Occurrence of all Alphabets: " + Arrays.toString(count));
            System.out.println("Alphabet with Maximum Occurrence: " + result);
        }
    }


