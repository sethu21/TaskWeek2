import java.util.Scanner;

public class DisplayMiddleChar {
    public static void displayMiddleChanger(String s) {

        int input = s.length();
        int middle = input/2;

        if (input%2 == 0){

            System.out.println("The middle character in the string: " + s.charAt(middle - 1) + s.charAt(middle));
        } else {
            System.out.println("The middle character in the string: " + s.charAt(middle));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s = input.nextLine();
        displayMiddleChanger(s);
    }
}
