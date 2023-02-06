import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Words:");
        String FirstWords = input.nextLine();
        System.out.println("Please Enter another Words: ");
        String SecondWords = input.nextLine();

        boolean isanagram = true;

        if(FirstWords.length() != SecondWords.length()){
            isanagram = false;

        }
        else {
            char[] FirstWordArray = FirstWords.toLowerCase().toCharArray();
            char[] SecondWordArray = FirstWords.toLowerCase().toCharArray();

            Arrays.sort(FirstWordArray);
            Arrays.sort(SecondWordArray);
            for(int i = 0; i < FirstWordArray.length; i ++){
                if(FirstWordArray!=SecondWordArray){
                    isanagram = false;
                    break;
                }
            }


        }
        if (isanagram ){
            System.out.println("These is an anagram");

        }
        else {
            System.out.println("These is not an anagram");
        }

    }
}
