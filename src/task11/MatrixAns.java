package task11;

public class MatrixAns {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 3);
        m1.inputMatrix();
        System.out.println("Matrix 1: ");
        m1.printMatrix();
        Matrix m2 = new Matrix(2, 1);
        m2.inputMatrix();
        System.out.println("Matrix 2: ");
        m2.printMatrix();

        m1.multiplyMatrix(m2);
        System.out.println("Result after adding: ");
        m1.printMatrix();

    }
}
