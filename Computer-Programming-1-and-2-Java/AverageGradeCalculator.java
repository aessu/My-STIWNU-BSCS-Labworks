import java.util.Scanner;

/**
 * Calculates the average of n decimal grades.
 * This program prompts for 8 decimal grades and computes their average.
 */
public class AverageGradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.println("--- Student Average Grade Calculator ---");

        // Prompting for eight decimal numbers
        System.out.print("Enter 1st grade: ");
        double grade_1 = input.nextDouble();

        System.out.print("Enter 2nd grade: ");
        double grade_2 = input.nextDouble();

        System.out.print("Enter 3rd grade: ");
        double grade_3 = input.nextDouble();

        System.out.print("Enter 4th grade: ");
        double grade_4 = input.nextDouble();

        System.out.print("Enter 5th grade: ");
        double grade_5 = input.nextDouble();

        System.out.print("Enter 6th grade: ");
        double grade_6 = input.nextDouble();

        System.out.print("Enter 7th grade: ");
        double grade_7 = input.nextDouble();

        System.out.print("Enter 8th grade: ");
        double grade_8 = input.nextDouble();

        // Computing the average grade
        double sum = grade_1 + grade_2 + grade_3 + grade_4 + grade_5 + grade_6 + grade_7 + grade_8;
        double average = sum / 8;

        // Output the average with exactly two decimal places
        System.out.println("---------------------------------------");
        System.out.printf("The average grade is: %.2f%n", average);
        System.out.println("---------------------------------------");

        input.close();
    }
}