public class FormulaForTriangle {
    int a, b, c;
    public double GetArea(){
        double s = (a+b+c)/2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));

    }
    public double Perimeter(){
        return (a+b+c);
    }
}
