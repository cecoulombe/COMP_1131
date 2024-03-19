/* Author: Caitlin Coulombe, T00756521
 * Date: March 18, 2024
 * Course: COMP 1131
 * Assignment 2 Question 3: Write an application that reads the radius and height of a cone then calculates and 
 * displays the volume and surface area. Use the following formulas, in which r and h represent the cone's radius 
 * and height. Print the output to four decimal places
 *      Testing: Include at least five test exhibits of your choice. They should show a planned approach (look 
 *      back at some of the Assignment 1 questions). Make sure you check the results through some other 
 *      independent source and include that evidence with your testing exhibits
 *          Probably want to test zeros for both, and with the radius being larger and the height being larger.
 */

 import java.util.Scanner;

 import java.text.DecimalFormat;

public class ConeCalculator {
    public static void main(String[] args) {
        // prompt the user for the radius and height
        // determine the slant height
        // compute the surface area
        // compute the volume
        // print both the volume and the area out

        // Variables
        double inputRadius;
        double inputHeight;

        double slantHeight;

        double surfaceArea;

        double volume;

        Scanner scan = new Scanner(System.in);
        
        DecimalFormat fmt = new DecimalFormat("0.####");

        // Constants
        final double PI = Math.PI;

        final double CONSTANT_VOL = 1.0 / 3.0;
        
        // prompt the user for the radius and the height
        System.out.println("Please enter the radius of the base of the cone. (note: must enter a non-zero, non-negative number or it will result in an error)");

        inputRadius = scan.nextDouble();

        if(inputRadius <= 0)
        {
            System.out.println("That is not a valid number, please enter a new, non-zero, non-negative value");

            inputRadius = scan.nextDouble();
        }

        System.out.println("Please enter the height of the cone. (note: must enter a non-zero, non-negative number or it will result in an error)");

        inputHeight = scan.nextDouble();

        if(inputHeight <= 0)
        {
            System.out.println("That is not a valid number, please enter a new, non-zero, non-negative value");

            inputHeight = scan.nextDouble();
        }

        scan.close();

        // compute the slant height
        slantHeight = Math.sqrt(Math.pow(inputRadius, 2) + Math.pow(inputHeight, 2));

        // compute the surface area
        surfaceArea = PI * inputRadius * (inputRadius + slantHeight);

        // compute the volume
        volume = CONSTANT_VOL * PI * Math.pow(inputRadius, 2) * inputHeight;

        // print both the volume and the surface area
        System.out.println("The surface area of a cone with a radius of " + inputRadius + " and a height of " + inputHeight + " is equal to " + fmt.format(surfaceArea) + ".");

        System.out.println("The volume of a cone with a radius of " + inputRadius + " and a height of " + inputHeight + " is equal to " + fmt.format(volume) + ".");
    }
}
