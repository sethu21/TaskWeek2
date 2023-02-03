package Task21;

import java.util.Scanner;

public class WordsLengthFinder {
    public static void main(String[] args) {


        //Scanner input = new Scanner(System.in);
        //System.out.println("Please enter a sentence to check words length");
       // String Words = input.next();
        String sentence = "This is an umbrella";
        String[] words = sentence.split(" ");
        String largestWord = words[0];
        String smallestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > largestWord.length()) {
                largestWord = words[i];
            }
            if (words[i].length() < smallestWord.length()) {
                smallestWord = words[i];
            }
        }
        System.out.println("Largest word: " + largestWord);
        System.out.println("Smallest word: " + smallestWord);

    }
}