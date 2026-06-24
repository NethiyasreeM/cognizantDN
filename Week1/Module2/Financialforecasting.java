public class Financialforecasting {

    public static double forecast(double amount, double rate, int years) {

        if (years == 0) {
            return amount;
        }

        return forecast(amount * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {

        double initialAmount = 10000;
        double growthRate = 0.10; // 10%
        int years = 3;

        double result = forecast(initialAmount, growthRate, years);

        System.out.println("Future Value: " + result);
    }
}