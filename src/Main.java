void main() {
    // Principal
    int principal = (int) Console.readNumber("Please Enter Your Principal ($1K - $1M) : ", 1000, 1000000);

    // Annual Rate
    float annualRate = (float) Console.readNumber("Please Enter Your Annual Interest Rate (1 - 30) : ", 1, 30);

    // Period
    byte years = (byte) Console.readNumber("Please Enter Period in Years (1 - 30) : ", 1, 30);

    var calculator = new MortgageCalculator(principal, annualRate, years);
    var report = new MortgageReport(calculator);

    // Mortgage
    report.printMortgage();

    // Payment Schedule
    report.printPaymentSchedule();
}