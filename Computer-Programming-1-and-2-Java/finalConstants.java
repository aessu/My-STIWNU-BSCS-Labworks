/**
 * Math and Unit Conversion Constants
 * Demonstrates the use of the 'final' keyword to create immutable (cannot be changed) values.
 */
public class finalConstants {
    public static void main(String[] args) {
        // 1. Geometry & Mathematical Constants
        final double PI = 3.141592653589793;
        final double E = 2.718281828459045;
        final double GOLDEN_RATIO = 1.61803398875;

        // 2. Time Conversion Constants
        final int SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60;
        final int HOURS_PER_DAY = 24;
        final int SECONDS_PER_HOUR = 3600; 
        final long MS_PER_SECOND = 1000L;

        // 3. Measurement & Metric Conversions
        final double KM_TO_MILES = 0.621371;
        final double KG_TO_LBS = 2.20462; 
        final double INCH_TO_CM = 2.54;
        final int CELSIUS_OFFSET = 32;

        // 4. Digital Storage Constants
        final int BYTES_PER_KB = 1024;
        final int KB_PER_MB = 1024;
        final int MB_PER_GB = 1024;

        // --- Displaying all values  ---
        System.out.println("======= MATH & UNIT CONSTANTS =======");
        
        System.out.println("\n[GEOMETRY]");
        System.out.println("Value of PI         : " + PI);
        System.out.println("Euler's Number (e)  : " + E);
        System.out.println("Golden Ratio        : " + GOLDEN_RATIO);

        System.out.println("\n[TIME CONVERSIONS]");
        System.out.println("Seconds per Minute  : " + SECONDS_PER_MINUTE);
        System.out.println("Minutes per Hour    : " + MINUTES_PER_HOUR);
        System.out.println("Hours per Day       : " + HOURS_PER_DAY);
        System.out.println("Seconds per Hour    : " + SECONDS_PER_HOUR);
        System.out.println("MS per Second       : " + MS_PER_SECOND);

        System.out.println("\n[UNIT CONVERSIONS]");
        System.out.println("KM to Miles factor  : " + KM_TO_MILES);
        System.out.println("KG to Lbs factor    : " + KG_TO_LBS);
        System.out.println("Inch to CM factor   : " + INCH_TO_CM);
        System.out.println("Celsius Offset      : " + CELSIUS_OFFSET);

        System.out.println("\n[DIGITAL STORAGE]");
        System.out.println("Bytes in 1 KB       : " + BYTES_PER_KB);
        System.out.println("KB in 1 MB          : " + KB_PER_MB);
        System.out.println("MB in 1 GB          : " + MB_PER_GB);
        System.out.println("=====================================");
    }
}