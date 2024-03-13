/* Author: Caitlin Coulombe, T00756521
 * Date: March 12, 2024
 * Course: COMP 1131
 * Assignment 2 Question 1: Write an application that converts a volume in Imperial gallons into litres (1 gallon equals 4.54609 litres).
 * Prompt and obtain the gallons amount from the user as a ecimal value and report the equivalent amount in litres.
 *      Testing: submit testing exhibits using the following inputs: 0, 1, 5, 0.25, and 12.34. You may add further inputs if you wish
 */

import java.util.Scanner;

public class ConvertUnits {
    // convert input from the user from Imperial gallons into litres
    // use the formula litres = gallows * 4.54609.
    public static void main(String[] args) {
        // print a line asking for input from the user
        // scan the input from the user and make sure it is the valid data type (throw an error if not)
        // perform the conversion on the data received
        // print the converted value

        // Variables
        final double conversionFactor = 4.54609;

        double inputGallons;
        double outputLitres;

        // Initialize the scanner so that it reads input from the keyboard
        Scanner scan = new Scanner(System.in);

        // Ask the user for gallons
        System.out.println("Enter an Imperial gallon amount to convert: ");

        // read the input from the user and make sure it is a valid data type
            // scanning for the next double so that it does not try to take in an invalid data type such as a string
        inputGallons = scan.nextDouble();

        // Convert the input from Imperial Gallons to litres
        outputLitres = inputGallons * conversionFactor;

        // print the converted value
        System.out.println(inputGallons + " Imperial gallons is equal to " + outputLitres + " litres.");
    }
}
