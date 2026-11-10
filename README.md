# Mortgage Calculator

A Java console app that calculates the monthly payment on a mortgage and prints the remaining balance after every payment.

## Features

- **Input validation:** keeps asking until each value is in range.
  - Principal: $1,000 to $1,000,000
  - Annual interest rate: 1 to 30 (%)
  - Period: 1 to 30 years
- **Monthly payment** using the standard amortization formula.
- **Full payment schedule:** the remaining balance after each monthly payment.
- **Currency formatting** of all amounts, based on the computer's locale.

## Project structure

The code is split into classes so each one has a single job:

| File | What it does |
|---|---|
| `Main.java` | Reads the inputs and runs the program |
| `Console.java` | Reads a number from the user and checks it is within a range |
| `MortgageCalculator.java` | The mortgage math: monthly payment and remaining balances |
| `MortgageReport.java` | Formats the results as currency and prints them |

## Formula

```
M = P * r(1 + r)^n / ((1 + r)^n - 1)
```

- `M`: monthly payment
- `P`: principal (the loan amount)
- `r`: monthly interest rate (annual rate / 100 / 12)
- `n`: number of payments (years * 12)

## Example

```
Please Enter Your Principal ($1K - $1M) : 100000
Please Enter Your Annual Interest Rate (1 - 30) : 5
Please Enter Period in Years (1 - 30) : 30
Mortgage
------------------------------------------------------------
Monthly Payment is : $536.82
------------------------------------------------------------
Payment Schedule
------------------------------------------------------------
$99,879.85
$99,759.19
...
$534.60
$0.00
```

## Requirements

- Java 25 or newer. `Main.java` is a compact source file (`void main()` with no class around it), which became standard in Java 25.

## How to run

**IntelliJ IDEA:** open the project folder and run `src/Main.java`.

**Terminal:** from the project folder, run:

```bash
java src/Main.java
```

Java finds the other classes in `src/` automatically.
