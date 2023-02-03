public class ConsonantDetector {
    public static void main(String[] args) {
        String input = "Hello, have a good day";
        String output = input.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");
        System.out.println(output);
    }
}



