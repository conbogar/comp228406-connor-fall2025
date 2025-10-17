package exercise3;

public abstract class Mortgage implements MortgageConstants{
    protected final String mortgageNumber;
    protected final String customerName;
    protected final double amount;
    protected final double interestRate;
    protected final int termYears;

    protected Mortgage(String mortgageNumber,
                       String customerName,
                       double amountRequested,
                       double interestRate,
                       int termRequested) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.amount = Math.min(amountRequested, MAX_MORTGAGE);
        this.termYears = (termRequested == SHORT_TERM ||
                termRequested == MEDIUM_TERM ||
                termRequested == LONG_TERM) ? termRequested : SHORT_TERM;
        this.interestRate = interestRate;
    }

    public double totalOwed() {
        return amount + (amount * interestRate * termYears);
    }

    public String getMortgageInfo() {
        return String.format(
                "%s | #%s | %s | Amount: $%.2f | Rate: %.2f%% | Term: %d yr | Total Owed: $%.2f",
                BANK_NAME, mortgageNumber, customerName, amount, interestRate * 100, termYears, totalOwed()
        );
    }
}

