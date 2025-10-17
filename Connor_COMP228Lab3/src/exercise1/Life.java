package exercise1;

public class Life extends Insurance{
    public Life(double inputFee) {
        super("Life", inputFee);
    }

    @Override
    public void setInsuranceCost() {
        monthlyCost = inputFee;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Type: %s | Monthly: $%.2f%n", getType(), getMonthlyCost());
    }
}
