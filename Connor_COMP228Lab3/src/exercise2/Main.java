package exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter tester name: ");
        String name = sc.nextLine().trim();

        System.out.print("Type (F for full-time, P for part-time): ");
        String type = sc.next().trim();

        GameTester tester;
        if(type.equalsIgnoreCase("F")) {
            tester = new FullTimeGameTester(name);
        } else if (type.equalsIgnoreCase("P")) {
            System.out.print("Enter hours: ");
            int hours = sc.nextInt();
            tester = new PartTimeGameTester(name, hours);
        } else {
            System.out.println("Unknown type.");
            return;
        }

        System.out.printf("%s | %s | Salary: $%.2f%n",
                tester.getName(),
                tester.isFullTime() ? "Full-Time" : "Part-Time",
                tester.determineSalary());
    }
}
