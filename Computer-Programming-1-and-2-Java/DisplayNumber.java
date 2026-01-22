/**
 * Primitive Data Types and Narrowing Casting
 * demonstrate number handling.
 */
public class DisplayNumber {
    public static void main(String[] args) {
        // Gaming/Data Stats
        int baseAttack = 87;                    
        double criticalRate = 84.67;           
        int framesPerSecond = 60;              
        double mapDistanceKM = 29.7;           
        long uidReference = 820581085L; 

        // Displaying all as whole numbers
        System.out.println("Base Attack: " + baseAttack);
        
        // Truncating decimal for a clean display
        System.out.println("Critical Rate (%): " + (int) criticalRate); 
        
        System.out.println("Performance (FPS): " + framesPerSecond);
        
        // Casting distance to whole KM
        System.out.println("Travel Distance: " + (int) mapDistanceKM);
        
        System.out.println("Account UID: " + uidReference);
    }
}