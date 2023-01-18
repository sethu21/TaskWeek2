package task11;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    int rows;
    int columns;



    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;

    }

    public Matrix() {

    }

    public void setRows(int rows) {
        Random Rows = new Random(4);
        rows = Rows.nextInt();
    }

    public void setColumns(int columns) {
        Random Columns = new Random(4);
        columns = Columns.nextInt();

    }



}




