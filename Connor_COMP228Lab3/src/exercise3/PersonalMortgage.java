package exercise3;

public class PersonalMortgage extends Mortgage{
    public PersonalMortgage(String number, String name, double amountRequested, double primeRate, int term) {
        super(number, name, amountRequested, primeRate + 0.02, term);
    }
}
