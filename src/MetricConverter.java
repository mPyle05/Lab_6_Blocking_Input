import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters = 0; // Variable to store the measurement in meters
        boolean done = false; // Flag to control the input validation loop

        // Input validation loop for the measurement in meters
        do {
            System.out.print("Enter the measurement in meters: ");
            if (in.hasNextDouble()) { // Check if input is a valid double
                meters = in.nextDouble(); // Read the input and assign it to the variable
                done = true; // Exit the loop since valid input is received
            } else {
                String trash = in.nextLine(); // Clear the input buffer
                System.out.println("\nInvalid input. Please enter a valid measurement.");
            }
        } while (!done); // Continue looping until valid input is received

        // Convert the measurement from meters to miles, feet, and inches
        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;

        // Output the converted measurements
        System.out.println("Measurement in miles: " + miles);
        System.out.println("Measurement in feet: " + feet);
        System.out.println("Measurement in inches: " + inches);
    }
}
