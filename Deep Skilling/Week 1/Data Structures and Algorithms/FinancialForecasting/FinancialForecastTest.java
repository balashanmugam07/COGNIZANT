public class FinancialForecastTest {

    public static void main(String[] args) {

        double currentValue = 10000.0;   // Initial Investment
        double growthRate = 0.10;        // 10% Annual Growth
        int years = 5;

        double futureValue = FinancialForecast.calculateFutureValue(currentValue, growthRate, years);

        System.out.println("Current Value : Rs." + currentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.println("Future Value  : Rs." + futureValue);

    }

}