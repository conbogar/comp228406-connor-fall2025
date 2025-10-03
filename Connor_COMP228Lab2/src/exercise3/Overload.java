package exercise3;

public class Overload {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b, double c) {
        return a + b + c;
    }

    public static int sum(int... nums) {
        int total = 0;
        for (int n : nums) total += n;
        return total;
    }
}
