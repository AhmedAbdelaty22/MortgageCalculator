
public class MortgageCalculator {

    private final static byte MONTHS = 12;
    private final static byte PERCENT = 100;

    private final int principal;
    private final float annualRate;
    private final byte years;

    public MortgageCalculator(int principal, float annualRate, byte years) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.years = years;
    }

    public double calculateMortgage() {
        float monthlyRate = getMonthlyInterest();
        int numberOfPayments = getNumberOfPayments();

        double mortgage;

        mortgage = principal * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments))
                / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        return mortgage;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyRate = getMonthlyInterest();
        int numberOfPayments = getNumberOfPayments();

        double balance;

        balance = principal
                * (Math.pow(1 + monthlyRate, numberOfPayments) - Math.pow(1 + monthlyRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        return balance;
    }

    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayments()];

        for (short payment = 1; payment <= balances.length; payment++) {
            balances[payment - 1] = calculateBalance(payment);
        }
        return balances;
    }

    private float getMonthlyInterest() {
        return annualRate / PERCENT / MONTHS;
    }

    private int getNumberOfPayments() {
        return years * MONTHS;
    }
}