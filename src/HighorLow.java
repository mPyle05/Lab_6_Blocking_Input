import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1; // Generate a random number between 1 and 10
        int guess = 0; // Variable to store the user's guess
        boolean done = false; // Flag to control the input validation loop

        // Input validation loop for the user's guess
        do {
            System.out.print("Guess the number (between 1 and 10): ");
            if (in.hasNextInt()) { // Check if input is a valid integer
                guess = in.nextInt(); // Read the input and assign it to the variable
                done = true; // Exit the loop since valid input is received
            } else {
                String trash = in.nextLine(); // Clear the input buffer
                System.out.println("\nInvalid input. Please enter a valid number between 1 and 10.");
            }
        } while (!done); // Continue looping until valid input is received

        // Check if the guess is out of range
        if (guess < 1 || guess > 10) {
            System.out.println("Your guess is out of range. Please guess between 1 and 10.");
        } else {
            // Output the random number and compare it with the user's guess
            System.out.println("The random number is: " + randomNumber);
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number correctly!");
            } else if (guess < randomNumber) {
                System.out.println("Sorry, your guess is too low.");
            } else {
                System.out.println("Sorry, your guess is too high.");
            }
        }
    }
}
