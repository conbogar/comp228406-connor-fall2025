package exercise1;

public abstract class Insurance {
    protected String insuranceType;
    protected double monthlyCost;
    protected double inputFee;

    protected Insurance(String insuranceType, double inputFee) {
        this.insuranceType = insuranceType;
        this.inputFee = inputFee;
    }

    public String getType() { return insuranceType; }
    public double getMonthlyCost() { return monthlyCost; }

    public abstract void setInsuranceCost();
    public abstract void displayInfo();
}
