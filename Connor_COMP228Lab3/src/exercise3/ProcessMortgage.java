package exercise3;

import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current prime rate (as percent, e.g., 5 for 5%): ");
        double primePercent = sc.nextDouble();
        double primeRate = primePercent / 100.0;

        Mortgage[] mortgages = new Mortgage[3];

        for (int i = 0; i < mortgages.length; i++) {
            System.out.printf("%nMortgage %d of %d%n", i + 1, mortgages.length);

            System.out.print("Type (B business, P personal): ");
            String type = sc.next().trim();

            System.out.print("Mortgage number: ");
            String number = sc.next().trim();

            System.out.print("Customer name: ");
            sc.nextLine(); // consume endline
            String name = sc.nextLine().trim();

            System.out.print("Amount requested: ");
            double amountRequested = sc.nextDouble();

            System.out.print("Term in years (1, 3, 5): ");
            int term = sc.nextInt(); // any other value will be forced to 1

            mortgages[i] = type.equalsIgnoreCase("B")
                    ? new BusinessMortgage(number, name, amountRequested, primeRate, term)
                    : new PersonalMortgage(number, name, amountRequested, primeRate, term);
        }

        System.out.println("\n=== All Mortgages ===");
        for (Mortgage m : mortgages) {
            System.out.println(m.getMortgageInfo());
        }
    }
}
