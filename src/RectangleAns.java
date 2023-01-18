import java.awt.*;

public class RectangleAns {
    int length;
    int breath;
    RectangleAns(int l,int b){
        this.length=l;
        this.breath=b;
    }
    public int area(){
        return length*breath;
    }
    public int perimeter(){
        return 2*(length+breath);
    }

    public static void main(String[] args) {
        RectangleAns one = new RectangleAns(4,5);
        RectangleAns two = new RectangleAns(5,8);
        System.out.println("Area: "+one.area() + "  Perimeter: "+one.perimeter());
        System.out.println("Area: "+two.area() + "  Perimeter: "+two.perimeter());
    }


    }

