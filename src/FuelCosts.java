import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0; // Variable to store the number of gallons of gas in the tank
        double efficiency = 0; // Variable to store the fuel efficiency in miles per gallon
        double pricePerGallon = 0; // Variable to store the price of gas per gallon
        boolean done = false; // Flag to control the input validation loop

        // Input validation loop for the number of gallons of gas in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) { // Check if input is a valid double
                gallons = in.nextDouble(); // Read the input and assign it to the variable
                done = true; // Exit the loop since valid input is received
            } else {
                String trash = in.nextLine(); // Clear the input buffer
                System.out.println("\nInvalid input. Please enter a valid number of gallons.");
            }
        } while (!done); // Continue looping until valid input is received

        done = false; // Reset the flag for the next input

        // Input validation loop for the fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) { // Check if input is a valid double
                efficiency = in.nextDouble(); // Read the input and assign it to the variable
                done = true; // Exit the loop since valid input is received
            } else {
                String trash = in.nextLine(); // Clear the input buffer
                System.out.println("\nInvalid input. Please enter a valid fuel efficiency.");
            }
        } while (!done); // Continue looping until valid input is received

        done = false; // Reset the flag for the next input

        // Input validation loop for the price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) { // Check if input is a valid double
                pricePerGallon = in.nextDouble(); // Read the input and assign it to the variable
                done = true; // Exit the loop since valid input is received
            } else {
                String trash = in.nextLine(); // Clear the input buffer
                System.out.println("\nInvalid input. Please enter a valid price per gallon.");
            }
        } while (!done); // Continue looping until valid input is received

        // Calculate the cost per 100 miles and the distance the car can go with the gas in the tank
        double costPer100Miles = (100 / efficiency) * pricePerGallon;
        double distance = efficiency * gallons;

        // Output the results
        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("Distance the car can go with the gas in the tank: " + distance + " miles");
    }
}
