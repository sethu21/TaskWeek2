import java.util.Scanner;

public class FindSmallestNumber {

    double num1,num2,num3;

    public static double FindSmallestNumber(double num1, double num2, double num3) {
        return Math.min(Math.min(num1,num2),num3);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        double num1 = scanner.nextDouble();

        System.out.println("enter Second Number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter Third Number: ");
        double num3 = scanner.nextDouble();

        System.out.println("Smallest number"+ FindSmallestNumber(num1,num2,num3));
    }

}

