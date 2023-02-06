import java.util.Scanner;

public class FutureInvestmentValue {
    public static void futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        System.out.println("Years    FutureValue");
        for (int i = 1; i <= years; i++) {
            double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate / 100 / 12, i * 12);
            System.out.println(i + "           " + String.format("%.2f", futureValue));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the investment amount: ");
        double investmentAmount = sc.nextDouble();
        System.out.print("Input the rate of interest: ");
        double monthlyInterestRate = sc.nextDouble();
        System.out.print("Input number of years: ");
        int years = sc.nextInt();
        futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
    }

}
