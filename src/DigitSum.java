import java.util.Scanner;

public class DigitSum {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a integer : ");
        int num = scanner.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits: " + sum);
    }
}
