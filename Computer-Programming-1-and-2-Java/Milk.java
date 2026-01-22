import java.util.Scanner;

/**
 * Dairy Farm Milk Production Calculator
 * Uses constants for fixed business rules and Scanner for daily production.
 */
public class Milk {
    public static void main(String[] args) {
        // Constants
        final double LITERS_PER_CARTON = 3.78; 
        final double COST_PER_LITER = 21.28;  
        final double PROFIT_PER_CARTON = 15.12;

        Scanner input = new Scanner(System.in);

        System.out.println("======= DAIRY FARM DAILY LOG (PHP) =======");

        // Ask user input for total liters produced
        System.out.print("Enter total milk produced this morning (liters): ");
        double totalLiters = input.nextDouble();

        // Calculations
        int totalCartons = (int) Math.round(totalLiters / LITERS_PER_CARTON);

        double totalCost = totalLiters * COST_PER_LITER;
        double totalProfit = totalCartons * PROFIT_PER_CARTON;

        // Displaying the results
        System.out.println("\n---------- PRODUCTION REPORT ----------");
        System.out.println("Carton Capacity          : " + LITERS_PER_CARTON + "L");
        System.out.println("Total Liters Produced    : " + totalLiters);
        System.out.println("Number of Cartons Needed : " + totalCartons);
        System.out.println("---------------------------------------");
        
        // Calculated costs and profits
        System.out.printf("Total Production Cost    : PHP %.2f%n", totalCost);
        System.out.printf("Total Morning Profit     : PHP %.2f%n", totalProfit);
        System.out.println("---------------------------------------");

        input.close();
    }
}