import java.util.Random; 
// .Random is used to access the Random class

/*
 * This program generates and displays a random integer between 0 and 10.
 */
public class randomNumber {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random number between 0 (inclusive) and 10 (inclusive)
        // nextInt(11) produces a range from 0 to 10
        int num = random.nextInt(11); 

        // Display the generated random number 
        System.out.println("The generated random number between 0 to 10 is: " + num);
    }
}