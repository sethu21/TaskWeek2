package Task8;

public class Complex {
    int Real, Imaginary;

    Complex() {
    }

    void Complex(int tempReal, int tempImaginary) {
        this.Real = tempReal;
        this.Imaginary = tempImaginary;
    }

    // Addiction
    Complex addComp(Complex C1, Complex C2) {
        Complex temp = new Complex();
        temp.Real = C1.Real + C2.Real;
        temp.Imaginary = C1.Imaginary + C2.Imaginary;
        return temp;
    }

    // for subtraction
    Complex SubtractionComp(Complex C1, Complex C2) {
        Complex temp = new Complex();
        temp.Real = C1.Real - C2.Real;
        temp.Imaginary = C1.Imaginary - C2.Imaginary;
        return temp;

    }

    Complex ProductComp(Complex C1, Complex C2) {
        Complex temp = new Complex();
        temp.Real = C1.Real * C2.Real;
        temp.Imaginary = C1.Imaginary * C2.Imaginary;
        return temp;
    }

}