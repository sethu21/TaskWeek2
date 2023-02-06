public class PrintCharacter {
    public static void printCharacters(char start, char end) {
        int count = 0;
        for (char i = start; i <= end; i++) {
            System.out.print(i + " ");
            count++;
            if (count % 20 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printCharacters('(', 'z');
    }
}
