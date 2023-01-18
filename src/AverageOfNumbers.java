import java.util.Scanner;

public class AverageOfNumbers {
    int one,two,three;

    void average(int a,int b, int c){
        this.one=a;
        this.two=b;
        this.three=c;
// itha create panna tha unnala bracket kulla irrukura value ah add panna mudiyum)

    }
    public int getAverage(){
        return (one+two+three)/2;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int aa,bb,cc;
        System.out.print("enter 1 value = ");
        aa = Input.nextInt();
        System.out.print("enter 2 value = ");
        bb = Input.nextInt();
        System.out.print("enter 3 value = ");
        cc = Input.nextInt();
        AverageOfNumbers sum = new AverageOfNumbers();// create new variable (appo tha average use panni bracket kulla call pannamudiyum)
        sum.average(aa,bb,cc);//ithula nee input variable ah add panna tha unnala ans kandupidika mudiyum
        System.out.println("Ans "+sum.getAverage());


    }

}

