import java.util.Arrays;
import java.util.Scanner;

/**
 * Performs range comparisons and basic statistical analysis on 5 numbers.
 */
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] nums = new double[5];
        double sum = 0;

        System.out.println("======= BASIC STATISTICS =======");
        
        // Array to hold 5 numbers (user input)
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = input.nextDouble();
            sum += nums[i];
        }

        // Sorting
        Arrays.sort(nums);
        double average = sum / 5;

        // Output
        System.out.println("\n--- Analysis Report ---");

        System.out.printf("Number %.1f is greater than %.1f but is less than %.1f%n", 
                          nums[1], nums[0], nums[2]);

        System.out.printf("Number %.1f is greater than %.1f and %.1f but less than %.1f%n", 
                          nums[2], nums[0], nums[1], nums[3]);

        System.out.println("");

        // Summary
        System.out.printf("Number %.1f is the highest number among 5 numbers%n", nums[4]);
        System.out.printf("Number %.1f is the smallest number among 5 numbers%n", nums[0]);
        System.out.printf("The mean / average of 5 numbers is %.2f%n", average);
        
        System.out.println("-----------------------");

        input.close();
    }
}