public class FormulaForTriangle {
    int a, b, c;
    public double GetArea(){
        double s = a+b+c;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);

    }
    public double Perimeter(){
        return (a+b+c);
    }
}
