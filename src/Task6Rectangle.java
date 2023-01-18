import java.util.Scanner;

public class Task6Rectangle {
    int length;
    int breath;
    void setDim(int l,int b){
        this.length = l;
        this.breath = b;

    }
    public double area(){
        return length*breath;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length,breath;
        System.out.println("Please enter length of Rectangle =");
        length = input.nextInt();
        System.out.println("Please enter a breath of rectangle = ");
        breath = input.nextInt();
        Task6Rectangle value = new Task6Rectangle();
        value.setDim(length,breath);
        System.out.println("Area = "+value.area() );

    }
}
