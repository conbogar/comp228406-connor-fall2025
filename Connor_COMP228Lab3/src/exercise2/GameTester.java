package exercise2;

public abstract class GameTester {
    protected final String name;
    protected final boolean fullTime;

    protected GameTester(String name, boolean fullTime) {
        this.name = name;
        this.fullTime = fullTime;
    }

    public String getName() { return name; }
    public boolean isFullTime() { return fullTime; }

    public abstract double determineSalary();
}
