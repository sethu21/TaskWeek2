import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side 1:");
        int side1 = scanner.nextInt();

        System.out.println("Input side 2:");
        int side2 = scanner.nextInt();

        System.out.println("Input side 3:");
        int side3 = scanner.nextInt();


        FormulaForTriangle area = new FormulaForTriangle();
        area.a = side1;
        area.b = side2;
        area.c = side3;


        System.out.println("Area of triangle :"+area.GetArea());




    }
}
