import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0; // Variable to store the width of the rectangle
        double height = 0; // Variable to store the height of the rectangle
        boolean done = false; // Flag to control the input validation loop

        // Input validation loop for the width of the rectangle
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) { // Check if input is a valid double
                width = in.nextDouble(); // Read the input and assign it to the variable
                done = true; // Exit the loop since valid input is received
            } else {
                String trash = in.nextLine(); // Clear the input buffer
                System.out.println("\nInvalid input. Please enter a valid width.");
            }
        } while (!done); // Continue looping until valid input is received

        done = false; // Reset the flag for the next input

        // Input validation loop for the height of the rectangle
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) { // Check if input is a valid double
                height = in.nextDouble(); // Read the input and assign it to the variable
                done = true; // Exit the loop since valid input is received
            } else {
                String trash = in.nextLine(); // Clear the input buffer
                System.out.println("\nInvalid input. Please enter a valid height.");
            }
        } while (!done); // Continue looping until valid input is received

        // Calculate the area, perimeter, and diagonal of the rectangle
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        // Output the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);
    }
}
