import java.util.Scanner;
/**
 * Demonstrates user input handling and basic arithmetic operations.
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String employeeName = input.nextLine(); 

        System.out.print("Enter Pay Rate (per hour): ");
        double payRate = input.nextDouble(); 

        System.out.print("Enter Total Hours of Work: ");
        double totalHours = input.nextDouble(); 

        double grossSalary = payRate * totalHours;

        System.out.println("\n----- EMPLOYEE DETAILS -----");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Pay Rate     : Php " + payRate);
        System.out.println("Total Hours  : " + totalHours);
        System.out.println("----------------------------");
        
        System.out.printf("GROSS SALARY : Php %.2f%n", grossSalary);
        System.out.println("----------------------------");

        input.close();
    }
}