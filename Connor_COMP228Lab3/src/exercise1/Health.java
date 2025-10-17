package exercise1;

public class Health extends Insurance{
    public Health(double inputFee) {
        super("Health", inputFee);
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
