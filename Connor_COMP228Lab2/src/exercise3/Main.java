package exercise3;

import static exercise3.Overload.sum;

public class Main {
    public static void main(String[] args) {
        int twoInts = sum(7, 5);
        double threeDoubles = sum(1.4, 2.5, 5.28);
        int manyInts = sum(1, 2, 3, 4, 5, 6);

        System.out.println("sum(7, 5) = " + twoInts);
        System.out.println("sum(1.4, 2.5, 5.28) = " + threeDoubles);
        System.out.println("sum(1, 2, 3, 4, 5, 6) = " + manyInts);
    }
}
