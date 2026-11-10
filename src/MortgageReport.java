import java.text.NumberFormat;

public class MortgageReport {

    private final MortgageCalculator calculator;
    private final NumberFormat currency;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        this.currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double Mortgage = calculator.calculateMortgage();

        String MortgageFormatted = currency.format(Mortgage);

        System.out.println("Mortgage");
        System.out.println("------------------------------------------------------------");
        System.out.println("Monthly Payment is : " + MortgageFormatted);
        System.out.println("------------------------------------------------------------");
    }

    public void printPaymentSchedule() {
        System.out.println("Payment Schedule");
        System.out.println("------------------------------------------------------------");

        for (double balance : calculator.getRemainingBalances()) {
            String balanceFormatted = currency.format(balance);
            System.out.println(balanceFormatted);
        }
    }
}