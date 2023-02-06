public class WordCounter {
    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        int wordCount = countWords(str);
        System.out.println("Number of words in the string: " + wordCount);
    }
}
