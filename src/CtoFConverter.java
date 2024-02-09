import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        boolean done = false;

        // Loop until valid input is provided
        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble(); // Read Celsius temperature
                done = true; // Set done to true to exit loop
            } else {
                String trash = in.nextLine(); // Clear input buffer
                System.out.println("\nInvalid input. Please enter a valid temperature.");
            }
        } while (!done);

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Equivalent temperature in Fahrenheit: " + fahrenheit);
    }
}
