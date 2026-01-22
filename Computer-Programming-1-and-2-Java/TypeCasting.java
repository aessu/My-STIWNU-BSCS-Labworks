/**
 * Widening (Implicit) and Narrowing (Explicit) Type Casting
 * demonstrates how Java handles converting values between different sizes.
 */
public class TypeCasting {
    public static void main(String[] args) {
        // Initializing variables
        double size = 133.83d; 
        short grade = 92;

        // Smallest to largest: byte -> short -> char -> int -> long -> float -> double
        // Widening Casting (Automatic): short to double
        // Since double is larger than short, no extra syntax is needed.
        double final_grade = grade; 

        // Narrowing Casting (Manual): double to int
        // add (int) to manually convert the double to an integer
        int final_length = (int) size; 

        // Displaying all values
        System.out.println("Size (double): " + size);
        System.out.println("Grade (short): " + grade);
        System.out.println("Final Grade (widened): " + final_grade);
        System.out.println("Final Length (narrowed): " + final_length);
    }
}