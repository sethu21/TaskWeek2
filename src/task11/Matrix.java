package task11;

import java.util.Scanner;

class Matrix {
    private int rows;
    private int columns;
    private int[][] elements;

    // constructor
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        elements = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setElement(int i, int j, int value) {
        elements[i][j] = value;
    }

    public void addMatrix(Matrix m) {
        if (rows != m.getRows() || columns != m.getColumns()) {
            System.out.println("Matrices cannot be added");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                elements[i][j] += m.elements[i][j];
            }
        }
    }

    public void multiplyMatrix(Matrix m) {
        if (columns != m.getRows()) {
            System.out.println("Matrices cannot be multiplied");
            return;
        }

        int[][] result = new int[rows][m.getColumns()];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < m.getColumns(); j++) {
                for (int k = 0; k < columns; k++) {
                    result[i][j] += elements[i][k] * m.elements[k][j];
                }
            }
        }
        elements = result;
        columns = m.getColumns();
    }

    public void inputMatrix() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                elements[i][j] = sc.nextInt();
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }
}




