/**
 * Employee Payroll Calculation
 * Demonstrates constant variables, arithmetic operations, and deductions
 * Updated with 2026 Philippine Statutory Rates
 */
public class Payslip {
    public static void main(String[] args) {
        // Input --> Current monthly salary (PHP 19,000)
        double grossSalary = 19000.00; 

        // Constants for 2026 Deductions
        double taxRate = 0.00;       
        double sssRate = 0.05;       
        double medicareRate = 0.025; 
        int pagibigDeduction = 200;   

        // Calculating Deduction Amounts
        double withholdingTax = grossSalary * taxRate;
        double sssContribution = grossSalary * sssRate;
        double medicare = grossSalary * medicareRate;
        
        double totalDeductions = withholdingTax + sssContribution + medicare + pagibigDeduction;
        double netPay = grossSalary - totalDeductions;

        // Displaying the Payslip
        System.out.println("----- EMPLOYEE PAYSLIP (2026) -----");
        System.out.println("Gross Monthly Pay: PHP " + grossSalary);
        System.out.println("-----------------------------------");
        System.out.println("Withholding Tax (Exempt): " + (int) withholdingTax);
        System.out.println("SSS Contribution (5%): " + (int) sssContribution);
        System.out.println("PhilHealth/Medicare (2.5%): " + (int) medicare);
        System.out.println("Pag-IBIG Contribution: " + pagibigDeduction);
        System.out.println("-----------------------------------");
        System.out.println("Total Deductions: PHP " + (int) totalDeductions);
        System.out.println("NET PAY: PHP " + (int) netPay);
        System.out.println("-----------------------------------");
    }
}