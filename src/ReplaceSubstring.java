import java.util.Scanner;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String Sentence = scanner.nextLine();
        System.out.print("Enter a substring to change: ");
        String oldSentence = scanner.nextLine();

        System.out.print("Enter a new sentence to change :");
        String newSentence = scanner.nextLine();

        String replaceSubstring = Sentence.replaceAll(oldSentence,newSentence);

        System.out.println("ReplaceSubstring "+ replaceSubstring);
    }
}
