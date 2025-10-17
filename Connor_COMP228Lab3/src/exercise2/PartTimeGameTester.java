package exercise2;

public class PartTimeGameTester extends GameTester{
    private final int hours;
    public PartTimeGameTester(String name, int hours) {
        super(name, false);
        this.hours = hours;
    }

    @Override
    public double determineSalary() { return hours * 20.0; }
    public int getHours() { return hours; }
}
