public class ReverseWord {

        public static String reverseWords(String text) {
            String[] words = text.split("[ .,\t]+");
            StringBuilder reversedText = new StringBuilder();
            for (String word : words) {
                reversedText.append(new StringBuilder(word).reverse().toString());
                int index = text.indexOf(word) + word.length();
                if (index < text.length()) {
                    reversedText.append(text.charAt(index));
                }
            }
            return reversedText.toString();
        }

        public static void main(String[] args) {
            System.out.println(reverseWords("www.google.com"));
        }
    }


