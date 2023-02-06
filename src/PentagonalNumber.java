public class PentagonalNumber {
    public static void printPentagonalNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            double pentagonalNumber = (i * (3 * i - 1)) / 2;
            System.out.print((int) pentagonalNumber + "  ");
        }
    }

    public static void main(String[] args) {
        printPentagonalNumbers(50);
    }
}

