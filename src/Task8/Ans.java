package Task8;

import java.util.Scanner;

public class Ans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter real");
        int c1 = input.nextInt();
        int b2 = input.nextInt();
        Complex first = new Complex();
        first.Complex(c1,b2);
        System.out.println("enter Imaginary");
        int cc1 = input.nextInt();
        int bb2 = input.nextInt();
        Complex second = new Complex();
        second.Complex(cc1,bb2);
        Complex res = new Complex();
        res = res.addComp(first,second);
        System.out.println("ans"+res.Real+" +i"+res.Imaginary);
        res = res.SubtractionComp(first,second);
        System.out.println("ans"+res.Real+" +i"+res.Imaginary);
        res = res.ProductComp(first,second);
        System.out.println("ans"+res.Real+" +i"+res.Imaginary);



    }
}
