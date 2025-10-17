package exercise1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Insurance> arr = new ArrayList<>();


        while(true) {
            System.out.print("Enter insurance type (Life/Health) or 'q' to finish: ");
            String insuranceType = sc.next().trim();
            if (insuranceType.equalsIgnoreCase("q")) break;
            System.out.print("Enter monthly fee: ");
            double fee = sc.nextDouble();

            Insurance policy =
                    insuranceType.equalsIgnoreCase("Life") ? new Life(fee) :
                    insuranceType.equalsIgnoreCase("Health") ? new Health(fee) : null;

            if (policy == null) {
                System.out.println("Unknown type. Try again.");
                continue;
            }
            arr.add(policy);
        }
        System.out.println("\n==== Policies ===");
        Insurance[] policies = arr.toArray(new Insurance[0]);
        for (Insurance p : policies) {
            p.setInsuranceCost();
            p.displayInfo();
        }
    }
}
