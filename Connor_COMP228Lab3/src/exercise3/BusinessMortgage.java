package exercise3;

public class BusinessMortgage extends Mortgage {
    public BusinessMortgage(String number, String name, double amountRequested, double primeRate, int term) {
        super(number, name, amountRequested, primeRate + 0.01, term);
    }
}
