import java.util.Scanner;

/**
 * Conditional Statements
 * Categorizes and calculates pay based on FT (Full-Time) and PT (Part-Time) status.
 */
public class Employee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Employee Name Input
        System.out.print("Enter employee name: ");
        String employee_name = input.nextLine();

        // Selection between FT and PT
        System.out.print("Press FT for Full Time or PT for Part Time: ");
        String status = input.next().toUpperCase();

        // Conditional Processing
        if (status.equals("FT")) {
            // --- FT (Full-Time) Logic ---
            System.out.println("--- Full Time Employee ---");
            System.out.print("Enter Basic Pay: ");
            double basicPay = input.nextDouble();

            displayHeader(employee_name);
            System.out.printf("Basic Pay:       %.1f%n", basicPay);
            System.out.println("_________________________________________________");
            System.out.printf("Gross Pay:       %.1f%n", basicPay);

        } else if (status.equals("PT")) {
            // --- PT (Part-Time) Logic ---
            System.out.println("--- Part Time Employee ---");
            System.out.print("Enter rate per hour: ");
            double rate = input.nextDouble();
            System.out.print("Enter no. of hours worked: ");
            int hours = input.nextInt();
            System.out.print("Enter no. of overtime: ");
            int overtime = input.nextInt();

            // Computations
            double basicPay = rate * hours;
            double overtimePay = overtime * (rate * 1.25);
            double grossPay = basicPay + overtimePay;

            displayHeader(employee_name);
            System.out.printf("Basic Pay:       %.1f%n", basicPay);
            System.out.printf("Overtime Pay:    %.2f%n", overtimePay);
            System.out.println("_________________________________________________");
            System.out.printf("Gross Pay:       %.2f%n", grossPay);

        } else {
            System.out.println("Error: Invalid selection. Please use 'FT' or 'PT'.");
        }

        input.close();
    }

    public static void displayHeader(String employee_name) {
        System.out.println("_________________________________________________");
        System.out.println("Employee Name:   " + employee_name);
    }
}