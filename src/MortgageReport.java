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

        IO.println("Mortgage");
        IO.println("------------------------------------------------------------");
        IO.println("Monthly Payment is : " + MortgageFormatted);
        IO.println("------------------------------------------------------------");
    }

    public void printPaymentSchedule() {
        IO.println("Payment Schedule");
        IO.println("------------------------------------------------------------");

        for (double balance : calculator.getRemainingBalances()) {
            String balanceFormatted = currency.format(balance);
            IO.println(balanceFormatted);
        }
    }
}